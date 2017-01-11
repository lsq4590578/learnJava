package com.java.chapter06;

/**
 * Created by joanl on 12/27/2016.
 */
public class TestSimpleDotCom1 {
    public static void main(String[] agrs) {
        SimpleDotCom2 simpledotcom = new SimpleDotCom2();
        int[] locationcells = {2, 3, 4};
        simpledotcom.setLocationcells(locationcells);
                String guessnum = "3";
        String result=simpledotcom.checkYouself(guessnum);
        String testresult="fialed";
        if(result.equalsIgnoreCase("hit")){
            testresult="pass";
        }
        System.out.println(testresult);

    }

}

