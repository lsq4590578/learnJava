package com.java.chapter05;

import java.util.Random;

/**
 * Created by joanl on 12/27/2016.
 */
public class TestSimpleDotCom2 {
    public static void main(String[] agrs) {
        int randnum=(int)(Math.random()*10);//随机生成一个数字应用设置泰康公司所占的格子
        int[] locationcells={randnum,randnum+1,randnum+2};//设置一个击中的数据。
        SimpleDotCom2 simpledc=new SimpleDotCom2();
        simpledc.setLocationcells(locationcells);
        Player player=new Player();//把原来设定的猜的数字，通过用户键盘输入形式进行
        String userguessnumber=player.getUserGuess("Please enter you guess number:");
        String[] userguessnum=userguessnumber.split(",");
        for(int i=0;i<userguessnum.length;i++){
            String guessnumber=userguessnum[i];
            int guessnum=Integer.parseInt(guessnumber);//遍历出每一个用户猜的数字。
            System.out.println("guessnumbe:"+guessnumber);
            String guessnumstr=String.valueOf(guessnum);
            simpledc.checkYouself(guessnumstr);
        }
    }

}
