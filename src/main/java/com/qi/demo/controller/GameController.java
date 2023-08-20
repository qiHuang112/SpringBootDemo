package com.qi.demo.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.qi.demo.AjaxResponse;
import com.qi.demo.bean.Game;
import com.qi.demo.bean.GameManager;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GameController {

    @GetMapping("/getAll/{name}")
    public AjaxResponse getAll(@PathVariable("name") String name) {
        var games = GameManager.getGames(name);
        return AjaxResponse.success(games);
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
