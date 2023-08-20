package com.qi.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * {
 *    "name":"辛",
 *    "buyCount":0,
 *    "cost":38.888888888888886,
 *    "profit":89.0,
 *    "score":189.0,
 *    "size":1
 * },
 */
@Data
@AllArgsConstructor
public class Player {
    private String name;
    private int buyCount;
    private double cost;
    private double profit;
    private double score;
    private int size;
}
