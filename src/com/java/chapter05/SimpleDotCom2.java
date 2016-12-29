package com.java.chapter05;

import java.io.InputStreamReader;

/**
 * Created by joanl on 12/26/2016.
 */
public class SimpleDotCom2 {
    int userguessadd=0;
    int[] locationcells;
    void setLocationcells(int[] cells){
        locationcells=cells;
    }
    int[] getLocationcells(){
        return locationcells;
    }
   String  checkYouself(String usreguess) {
       int userguessnum = Integer.parseInt(usreguess);
       String result = "miss";
       for (int cellws : locationcells) {
           if (userguessnum == cellws) {
               result = "hit";
               userguessadd++;
               break;
           }
           if (userguessadd == locationcells.length) {
               result = "kill";
           }
       }
       System.out.println(result);
       return result;
   }

}
