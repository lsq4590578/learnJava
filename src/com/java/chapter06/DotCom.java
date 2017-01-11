package com.java.chapter06;

import java.util.ArrayList;

/**
 * Created by joanl on 1/3/2017.
 */
public class DotCom{
    private String dotcomName;
   private ArrayList<String> locationCells;
    public void setLocationCells(ArrayList<String> locs) {
        this.locationCells = locs;
    }


    int userguessadd=0;
//        int[] locationcells;int[] locationcells;
//    void setLocationcells(int[] cells){
//        locationcells=cells;
//    }
//    int[] getLocationcells(){
//        return locationcells;
//    }
    String  checkYouself(String usreguess) {
    //        int userguessnum = Integer.parseInt(usreguess);
        String result = "miss";
        int index = locationCells.indexOf(usreguess);//如果玩家猜中的话，那么返回它的位置，没有猜中返回-1；
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println(" Oh Good you sink: " + dotcomName);
            } else {
                result = "hit";
            }
        }
        return result;
    }

    public void setDotcomName(String sname) {
        dotcomName = sname;
    }



}
