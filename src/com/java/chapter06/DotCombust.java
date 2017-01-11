package com.java.chapter06;


import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by joanl on 1/3/2017.
 */
public class DotCombust {
    GameHelper gameHelper = new GameHelper();
        ArrayList<DotCom> companyObjectList = new ArrayList<DotCom>();
    int numberof=0;
  //  public static void main(String[] agrs) throws IOException {
    public void setUpGame() throws IOException {
        DotCom d1 = new DotCom();
        d1.setDotcomName("Go2.com");
        DotCom d2 = new DotCom();
        d2.setDotcomName("Pets.com");
        DotCom d3 = new DotCom();
        d3.setDotcomName("AskMe.com");
        companyObjectList.add(d1);
        companyObjectList.add(d2);
        companyObjectList.add(d3);
        System.out.println("You goals is sink three dot coms.");
        System.out.println("Go2.com,Pets.com,AskMe.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
        for (DotCom dotcomtoset : companyObjectList) {
            ArrayList<String> newlocation = gameHelper.placeDotcom(3);
            dotcomtoset.setLocationCells(newlocation);
        }

    }
    public void startPlaying(){
        while (!companyObjectList.isEmpty()){
            String userguess=gameHelper.getUserInput("Enter a guess");
            checkUserGuess(userguess);
        }
        finishPlaying();

    }
        private void checkUserGuess(String userguew){
        numberof++;
        String result="miss";
        for(DotCom dotComtoTest:companyObjectList){
            result=dotComtoTest.checkYouself(userguew);
            if (result.equals(" hit")){
                break;
            }
            if(result.equals("kill")){
                companyObjectList.remove(dotComtoTest);
                break;
            }
        }
        System.out.println(result);
    }


private void finishPlaying(){
    System.out.println("All the dot coms is dead! you stock is now worthless.");
    if (numberof<=18){
        System.out.println("It is only took you "+numberof+" guesses");
        System.out.println("You got out before you options sank");
    }else{
        System.out.println("took you long enough "+numberof+" guesses");
        System.out.println("Fish  are dancing with you options");
    }
}
    public static void main(String[] agrs) throws IOException {
        DotCombust game=new DotCombust();
        game.setUpGame();
        game.startPlaying();

    }
}
