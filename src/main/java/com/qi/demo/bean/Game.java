package com.qi.demo.bean;

import lombok.Builder;
import lombok.Data;

import java.util.Map;


/**
 * {
 *    "configs":{
 *       "单次买入":100.0,
 *       "汇率":1.0,
 *       "台费":350.0,
 *       "误差筹码":0.0
 *    },
 *    "id":1,
 *    "players":[
 *       {
 *          "buyCount":0,
 *          "cost":38.888888888888886,
 *          "name":"司",
 *          "profit":278.0,
 *          "score":378.0,
 *          "size":1
 *       },
 *       {
 *          "buyCount":0,
 *          "cost":38.888888888888886,
 *          "name":"超",
 *          "profit":365.0,
 *          "score":465.0,
 *          "size":1
 *       },
 *       {
 *          "buyCount":1,
 *          "cost":38.888888888888886,
 *          "name":"石",
 *          "profit":-86.0,
 *          "score":114.0,
 *          "size":1
 *       },
 *       {
 *          "buyCount":1,
 *          "cost":38.888888888888886,
 *          "name":"晨",
 *          "profit":-115.0,
 *          "score":85.0,
 *          "size":1
 *       },
 *       {
 *          "buyCount":0,
 *          "cost":38.888888888888886,
 *          "name":"恺",
 *          "profit":31.0,
 *          "score":131.0,
 *          "size":1
 *       },
 *       {
 *          "buyCount":0,
 *          "cost":38.888888888888886,
 *          "name":"汤",
 *          "profit":20.0,
 *          "score":120.0,
 *          "size":1
 *       },
 *       {
 *          "buyCount":0,
 *          "cost":38.888888888888886,
 *          "name":"佬",
 *          "profit":118.0,
 *          "score":218.0,
 *          "size":1
 *       },
 *       {
 *          "buyCount":0,
 *          "cost":38.888888888888886,
 *          "name":"辛",
 *          "profit":89.0,
 *          "score":189.0,
 *          "size":1
 *       },
 *       {
 *          "buyCount":6,
 *          "cost":38.888888888888886,
 *          "name":"黄",
 *          "profit":-700.0,
 *          "score":0.0,
 *          "size":1
 *       }
 *    ],
 *    "startTime":1673625600000,
 *    "name":"de"
 * }
 */

@Data
@Builder
public class Game {
    private Map<String, Double> configs;
    private int id;
    private Player[] players;
    private long startTime;
    private String name;
}
