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

    public ArrayList<String> placeDotcom(int comsize){
    ArrayList<String> alphaCells=new ArrayList<String>();
    String[] alphacoords=new String[comsize];
        String temp=null;
        int[] coords=new int[comsize];
        int attempts=0;
        boolean success=false;
        int location=0;
        comCount++;
        int incr=1;
        if((comCount % 2)==1)//如果是单数
        {
            incr=gridLength;//垂直增量
        }
        while(!success & attempts++ < 200){
               location=(int)(Math.random()*gridSize);
            System.out.println("try"+location);
            int x=0;
            success=true;
            while (success &&  x<comsize){
                if(grid[location]==0){
                    coords[x++]=location;
                    location+=incr;

                if(location>=gridSize){
                    success=false;
                }
                if(x>0&&(location%gridLength)==0){
                    success=false;
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
