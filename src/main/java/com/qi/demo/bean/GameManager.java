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

    public static int getSize(String type) {
        List<Game> gameList = getGames(type);
        return gameList == null ? 0 : gameList.size();
    }

    @Bean
    public Map<String, List<Game>> getGames() {
        return games;
    }

    public static void addGame(Game game) {
        var games = ContextUtil.getContext().getBean(GameManager.class).getGames();
        var gameList = games.get(game.getType());
        if (gameList == null) {
            gameList = new ArrayList<>();
        }
        gameList.add(game);
        games.put(game.getType(), gameList);
    }

    public static void addAllGame(List<Game> gameList) {
        var games = ContextUtil.getContext().getBean(GameManager.class).getGames();
        for (var game : gameList) {
            var list = games.get(game.getType());
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(game);
            games.put(game.getType(), list);
        }
    }

    public static List<Game> getGames(String type) {
        return ContextUtil.getContext().getBean(GameManager.class).getGames().get(type);
    }

    public static void removeGame(String type) {
        ContextUtil.getContext().getBean(GameManager.class).getGames().remove(type);
    }

}
