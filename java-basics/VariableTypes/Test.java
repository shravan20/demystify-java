package JavaBasics.VariableTypes;

public class Test {
    
    
    public void pupAge() {   
        int age; //Local Variable age is not initialized
        //   age= 0;
        age= 0;
        age = age + 7;
       System.out.println("Puppy age is : " + age);
    }
    /**
     * VariableTypes/Test.java:8: error: variable age might not have been initialized age = age + 7;       
     */
 
    public static void main(String args[]) {
       Test test = new Test();
       test.pupAge();
    }
 }
