package com.java.chapter02;

/**
 * Created by joanl on 12/22/2016.
 */
public class DrumKitTestDrive {
    public static void main(String [] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();//这步错了。
        if (d.snare == true) {
            d.playSnare();
        }

    }
}
