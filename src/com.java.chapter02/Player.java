package com.java.chapter02;

/**
 * Created by joanl on 12/17/2016.
 */
public class Player {
    int number;
    int guess(){
        number=(int)(Math.random()*10);
        return number;
    }

}
