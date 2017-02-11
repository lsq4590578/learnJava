package com.java.chapter06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by joanl on 1/3/2017.
 */
public class GameHelper {
    private static  final String alphabet="abcdefg";
    private int gridLength=7;
    private int gridSize=49;
    private int[] grid=new int[gridSize];
    private int comCount=0;
    public String getUserInput(String guessnum){
        System.out.println(guessnum+" ");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String line= null;
        try {
            line = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (line.length()==0)return null;
        return line;
    }
/*
* method:设置三个网址的位置
* 1.一个7×7的格子
* 2.格子中有三个网站
* 3.每一个网站占格子中的三个位置
* */
    public ArrayList<String> placeDotcom(int comsize){
        //声明一个数组用于保存已经确定的网站所占格子的位置
    ArrayList<String> alphaCells=new ArrayList<String>();
        //该数组为保存一个网址的位置,击中则为kill一个网址
    String[] alphacoords=new String[comsize];
        String temp=null;
        int[] coords=new int[comsize];//网址所占位置下标数组，击中一个则为hit
        int attempts=0;
        boolean success=false;
        int location=0;
        comCount++;
        int incr=1;
        //加1则为a1 b1同一行
        //加7则为a1 a2下一行了

        /*
        *7×7的格子：
        *    a0 b0 c0 d0 e0 f0 g0
        *    a1 b1 c1 d1 e1 f1 g1
         *   a2 b2 c2 d2 e2 f2 g2
         *   a3 b3 c3 d3 e3 f3 g3
         *   a4 b4 c4 d4 e4 f4 g4
         *   a5 b5 c5 d5 e5 f4 g4
         *   a6 b6 c6 d6 e6 f6 g5
        *
        * */



        if((comCount % 2)==1)//如果是单数
        {
            incr=gridLength;//垂直增量
        }



//尝试输入200次如果locaction==0的话那么就是没有被设置的格子，可以进行赋值。
        while(!success && attempts++ < 200){
               location=(int)(Math.random()*gridSize);
            System.out.println("try"+location);
            int x=0;
            success=true;
            //如果格子设置1-3之间那么就将该位置设置给Coords数组，如果这个格子一开始就是为48，49了，那么就要重新找格子的位置。
            while (success &&  x<comsize){
                if(grid[location]==0){
                    coords[x++]=location;
                    location+=incr;
            //超出下边缘，超出则设置格子失败
                if(location>=gridSize){
                    success=false;//重新回到while(!success && attempts++ < 200)中查找位置。
                }
            //判断是否超出右边缘，格子超出行边界
                if(x>0&&(location%gridLength)==0){
                    success=false;///重新回到while(!success && attempts++ < 200)中查找位置。
                }
            }else{
                success=false;
            }
            }
        }






        int y=0;
        int row=0;
        int column=0;
        while(y<comsize){
            grid[coords[y]]=1;
            row=(int)(coords[y]/gridLength);
            column=coords[y]%gridLength;
            temp=String.valueOf(alphabet.charAt(column));
            alphaCells.add(temp.concat(Integer.toString(row)));
            y++;
            System.out.println("coord"+y+"="+alphaCells.get(y-1));
        }
        return alphaCells;
    }
}
