package JavaBasics.Constructors;

public class ConsDemo {
    public static void main(String args[]) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();
        System.out.println(t1.num + " " + t2.num);

        // Parameterized Ctor
        MyClass t3 = new MyClass(30);
        System.out.println("Parameterized Ctor Value:" + t3.num);
     }
}
