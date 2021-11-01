package JavaBasics.JavaPackagesTwo;
import JavaPackagesTwo.Packages.*;

public class MainClass {
    
    public static void main(String[] args){
        Packages obj1 = new Packages("Shravan Kumar B");
        Packages obj2 = new Packages("S K B");

        obj1.empAge(26);
        obj1.empDesignation("Senior Software Engineer");
        obj1.empSalary(1000);
        obj1.printEmployee();
    
        obj2.empAge(21);
        obj2.empDesignation("Software Engineer");
        obj2.empSalary(500);
        obj2.printEmployee();
    }

}
