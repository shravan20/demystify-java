package JavaPolymorphism;

interface Vegetarian {}
class Animal {}
public class Deer extends Animal implements Vegetarian {

    public static void main(String [] args) {

        Deer d = new Deer();
        Animal a = d;
        Vegetarian v = d;
        Object o = d;
        System.out.println("Deer d = "+d);
        System.out.println("Animal a = "+a);
        System.out.println("Vegetarian v = "+d);
        System.out.println("Object o = "+d);
    }



}