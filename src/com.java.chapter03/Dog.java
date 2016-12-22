package com.java.chapter03;

/**
 * Created by joanl on 12/21/2016.
 */
public class Dog {
        String name;
        public static void main(String[] agrs){
                //创建Dog对象
                Dog dog1=new Dog();
                dog1.bark();
                dog1.name="xiaohei";
                //创建Dog数组
                Dog[] pets=new Dog[3];
                //关门放狗
                pets[0]=new Dog();
                pets[1]=new Dog();
                pets[2]=dog1;
                //通过数组引用存取Dog
                pets[0].name="xiaobai";
                pets[1].name="xiaohua";

                System.out.println("last's dog name:"+pets[1].name);

                for(int i=0;i<pets.length;i++){
                        pets[i].bark();
                }


        }
public void bark(){
        System.out.println(name+"汪汪");
}
}
