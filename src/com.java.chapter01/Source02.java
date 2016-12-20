/**
 * Created by joanl on 12/15/2016.
 */
public class Source02 {
    public static void main(String[] agrs) {
        int beernum = 99;
        String word = "bottes";
        while (beernum > 0) {
            if (beernum == 1) {
                word = "bottes";
            }
            //System.out.println(beernum + "" + word + "of beer on the wall");

            System.out.println(beernum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beernum = beernum - 1;
            if (beernum > 0) {
                System.out.println( "*************************************************");
                System.out.println(beernum + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }

}