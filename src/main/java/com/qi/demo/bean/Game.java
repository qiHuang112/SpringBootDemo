package com.qi.demo.bean;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;


/**
 * {
 *    "configs":{
 *       "单次买入":100.0,
 *       "汇率":1.0,
 *       "台费":350.0,
 *       "误差筹码":0.0
 *    },
 *    "players":[
 *       {
 *          "name":"司",
 *          "buyCount":0,
 *          "cost":38.888888888888886,
 *          "profit":278.0,
 *          "score":378.0,
 *          "aa":1
 *       }
 *    ],
 *    "type":"de"
 *    "date":"2023-05-19 00:00:00:000",
 * }
 */

@Data
@Builder
public class Game {
    private Map<String, Double> configs;
    private List<Player> players;
    private String type;
    private String date;
}
