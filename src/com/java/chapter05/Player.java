package com.java.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.BatchUpdateException;
import java.util.Scanner;

/**
 * Created by joanl on 12/26/2016.
 */
public class Player {
public String getUserGuess(String inputContent) {
    String line=null;
    System.out.println(inputContent+ "  ");
    try {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        line = input.readLine();//将输入的内容一行一行读出
        if(line.length()==0) return null;
    } catch (IOException e) {
        e.printStackTrace();
    }
    return line;
}
}

