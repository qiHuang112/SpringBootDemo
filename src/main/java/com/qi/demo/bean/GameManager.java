package com.qi.demo.bean;


import com.qi.demo.util.ContextUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class GameManager {
    private final Map<String, List<Game>> games = new HashMap<>();

    @Bean
    public Map<String, List<Game>> getGames() {
        return games;
    }

    public static void addGame(Game game) {
        var games = ContextUtil.getContext().getBean(GameManager.class).getGames();
        var gameList = games.get(game.getName());
        if (gameList == null) {
            gameList = new ArrayList<>();
        }
        gameList.add(game);
        games.put(game.getName(), gameList);
    }

    public static void addAllGame(List<Game> gameList) {
        var games = ContextUtil.getContext().getBean(GameManager.class).getGames();
        for (var game : gameList) {
            var list = games.get(game.getName());
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(game);
            games.put(game.getName(), list);
        }
    }

    public static List<Game> getGames(String name) {
        return ContextUtil.getContext().getBean(GameManager.class).getGames().get(name);
    }

    public static void removeGame(String name) {
        ContextUtil.getContext().getBean(GameManager.class).getGames().remove(name);
    }

    public static void removeGameById(String name, int id) {
        var games = ContextUtil.getContext().getBean(GameManager.class).getGames();
        var gameList = games.get(name);
        if (gameList != null) {
            gameList.removeIf(game -> game.getId() == id);
        }
    }
}
