package com.java.chapter04;

import java.util.Arrays;

/**
 * Created by joanl on 1/15/2017.
 */
public class Prethreescore {


        //完成 main 方法
        public static void main(String[] args) {
            int[] scores={89 , -23 , 64 , 91 , 119 , 52 , 73};
            Prethreescore prethreescore =new Prethreescore();
            prethreescore.getThreeScore(scores);
        }

        //定义方法完成成绩排序并输出前三名的功能

        public void getThreeScore(int[] scores){
            int i = 0;
            int count=0;
            int max=scores[0];//最大值初始化为数组第一个89；
            //int[] three=new int[scores.length];
            //int[] lastmax = new int[scores.length];
            Arrays.sort(scores);
            System.out.println("前三名的成绩：");
            for(i=scores.length-1;i>0;i--){
                if(scores[i]>0&&scores[i]<100){
                  System.out.println(scores[i]);
                    count++;
                    if(count>2){
                        break;
                    }
                }else{
                    //System.out.println("成绩不再0-100之间");
                    continue;
                }
            }
        }


    public int[] getArray(int length) {
        // 定义指定长度的整型数组
        int[] nums = new int[length];

        // 循环遍历数组赋值
        for (int i=0;i<nums.length;i++) {

            // 产生一个100以内的随机数，并赋值给数组的每个成员
            nums[i]=(int)(Math.random()*100);

        }
        return nums; // 返回赋值后的数组
    }

    }

