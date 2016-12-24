package com.java.chapter04;

/**
 * Created by joanl on 12/24/2016.
 */
public class Dog {
    private int size;
    private String name;
    void bark(){
        if(size>60){
            System.out.println("Ruff! Ruff!");
        }else if(size>14){
            System.out.println("WU! WU!");

        }else {
            System.out.println("Wang ! Wang！");
        }

    }
public void setSize(int s){
    size=s;
}
public int getSize(){
    return size;
}
public void setName(String dogname){
    name=dogname;
}
public String getName(){
    return name;
}
//
}
