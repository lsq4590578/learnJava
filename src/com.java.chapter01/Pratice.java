/**
 * Created by joanl on 12/17/2016.
 */

//    class shuffle1{
//        public static void main(String[] agrs) {
//            int x = 3;
//            if(x>2){
//                System.out.print("a");
//            }
//            while(x>0){
//                x=x-1;
//                System.out.print("-");
//                if (x == 2) {
//                    System.out.print("b,c");
//                }
//                if (x == 1) {
//                    System.out.print("d");
//                    x=x-1;
//                }
//            }
//            }
//        }


//class Test {
//    public static void main(String [] args) {
//        int x = 0;
//        int y = 0;
//        while ( x < 5 ) {
//            if ( y < 5 ) {
//                x = x + 1;//x=3
//                if ( y < 3 ) {
//                    x = x - 1;//x=3-1=2
//                }
//            }
//            y = y + 2;//y=0+2=2 6
//            System.out.print(x + "" + y + "");//02 14 26 38
//            x = x + 1;//1 2
//        }
//    }
////}
//class PoolPuzzleOne {
//    public static void main(String [] args) {
//        int x = 0;
//        while ( x < 4 ) {
//            System.out.print("a");
//            if ( x < 1 ) {
//                System.out.print(" ");
//            }
//            System.out.print("n");
//            if (  x > 1 ) {
//                System.out.print("oyster");
//                x = x + 2;
//            }
//            if ( x == 1 ) {
//                System.out.print("noys");
//            }
//            if ( x < 1 ) {
//                System.out.print("oise");
//            }
//            System.out.println("");
//             x= x + 1;
//        }
//    }
//}

class Exercise1b {
    public static void main(String [] args) {
        int x = 1;
        while ( x < 10 ) {
            x=x+1;
            if ( x > 3) {
                System.out.println("big x");
            }
        }
    }

}