package com.qi.demo.controller;


import com.qi.demo.AjaxResponse;
import com.qi.demo.bean.Game;
import com.qi.demo.bean.GameManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {

    @GetMapping("/getAll/{type}")
    public AjaxResponse getAll(@PathVariable("type") String type) {
        var games = GameManager.getGames(type);
        return AjaxResponse.success(games);
    }

    @GetMapping("/getSize/{type}")
    public AjaxResponse getHashCode(@PathVariable("type") String type) {
        return AjaxResponse.success(List.of(GameManager.getSize(type)));
    }

    @PostMapping("/addGame")
    public AjaxResponse addGame(@RequestBody Game game) {
        GameManager.addGame(game);
        return AjaxResponse.success();
    }


    @PostMapping("/addAllGame")
    public AjaxResponse addAllGame(@RequestBody List<Game> gameList) {
        GameManager.addAllGame(gameList);
        return AjaxResponse.success();
    }

    @DeleteMapping("/removeAllGames/{name}")
    public AjaxResponse removeAllGames(@PathVariable("name") String name) {
        GameManager.removeGame(name);
        return AjaxResponse.success();
    }

}
