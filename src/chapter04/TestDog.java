package chapter04;

/**
 * Created by joanl on 12/24/2016.
 */
public class TestDog {
    public static void main(String[] agrs){
        Dog mydog1=new Dog();
        mydog1.setSize(70);
        System.out.println("Dog one size"+mydog1.getSize());
        mydog1.bark();
        Dog mydog2=new Dog();
        mydog2.setSize(16);
        System.out.println("Dog two size"+mydog2.getSize());
        mydog2.bark();
        Dog mydog3=new Dog();
        mydog3.setSize(12);
        System.out.println("Dog three size"+mydog3.getSize());
        mydog3.bark();

    }
}
