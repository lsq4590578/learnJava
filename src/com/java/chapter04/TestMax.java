package com.java.chapter04;
import java.util.Arrays;
/**
 * Created by joanl on 1/15/2017.
 */
public class TestMax {
    int[] ages={18 ,23 ,21 ,19 ,25 ,29 ,17,60};
    public static void main(String[] agrs){
    TestMax tm=new TestMax();
        int lastmax =tm.getMaxAge();
        System.out.println("最大年龄为： "+ lastmax);
    }
    public int getMaxAge(){
        int max=ages[0];
        //Arrays.sort(ages);
       for (int age:ages) {
            if(age>max){
                max=age;
            }
        }
        return max;
    }
}
