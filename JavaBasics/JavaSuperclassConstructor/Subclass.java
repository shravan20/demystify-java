package JavaBasics.JavaSuperclassConstructor;


public class Subclass extends Superclass {
    
    Subclass(int age) {
        super(age);
    }
  
     public static void main(String args[]) {
        Subclass s = new Subclass(24);
        s.getAge();
     }
}
