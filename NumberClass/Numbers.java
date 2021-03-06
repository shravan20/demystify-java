package NumberClass;

public class Numbers {

    public static void main(String args[]) {
       Integer x = 5; // boxes int to an Integer object
       x =  x + 10;   // unboxes the Integer to a int
       System.out.println(x); 
    }
 }

//  The object of the wrapper class contains or wraps its respective primitive data type. Converting primitive data types into object is called boxing, and this is taken care by the compiler. Therefore, while using a wrapper class you just need to pass the value of the primitive data type to the constructor of the Wrapper class.

// And the Wrapper object will be converted back to a primitive data type, and this process is called unboxing. The Number class is part of the java.lang package.

