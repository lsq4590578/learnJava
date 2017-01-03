package com.java.chapter02;

/**
 * Created by joanl on 12/17/2016.
 */
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    void startGame(){
        p1=new Player();
        p2=new Player();
        p3=new Player();

        int guessone=0;
        int guesstwo=0;
        int guseethress=0;

        boolean guessoneRight=false;
        boolean guesstwoRight=false;
        boolean guessthressRight=false;
        int randomnumber=(int)(Math.random()*10);//产生随机数，供猜测用
        System.out.println("请猜测从0-9之间的数字：");
        while(true){
            System.out.println("Number to guess is " + randomnumber);
            guessone= p1.guess();
            guesstwo=p2.guess();
            guseethress=p3.guess();
            guessone=p1.number;
            System.out.println("guessone number is "+guessone);
            guesstwo=p2.number;
            System.out.println("guesstwo number is "+guesstwo);
            guseethress=p3.number;
            System.out.println("guseethress number is "+guseethress);

            if(guessone==randomnumber){
                guessoneRight=true;
            }
            if(guesstwo==randomnumber){
                guesstwoRight=true;
            }
            if(guseethress==randomnumber){
                guessthressRight=true;
            }
            if(guessoneRight||guesstwoRight||guessthressRight){
                System.out.println("我们赢了");
                System.out.println("guessone got it right?"+guessoneRight);
                System.out.println("guesstwo got it right?"+guesstwoRight);
                System.out.println("guseethress got it right?"+guessthressRight);
                break;
            }else{
                System.out.println("游戏失败了，请再试一次！");
            }

        }
    }
}
