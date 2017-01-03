package chapter04;

/***
 * 该代码的作用是，按数字从大到小，然后又从小到大
 */

/**
 * Created by joanl on 12/25/2016.
 */
public class Puzzle4 {
    public static void main(String[] agrs){
        Puzzle4b[] obs=new Puzzle4b[6];
        int x=0;
        int y=1;
        int result=0;
        while (x<6){
            obs[x]=new Puzzle4b();
            obs[x].ivar=y;
            y=y*10;
            x=x+1;
        }
        x=6;
        while(x>0){
            x=x-1;
            result=result+obs[x].doStuff(x);
        }
        System.out.println("result:"+result);


    }
}
