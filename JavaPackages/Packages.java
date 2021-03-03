package JavaPackages;

import java.io.*;

class PackagesTest {

   String name;
   int age;
   String designation;
   double salary;

   // This is the constructor of the class Employee
   public PackagesTest(String name) {
      this.name = name;
   }

   // Assign the age of the Employee  to the variable age.
   public void empAge(int empAge) {
      age = empAge;
   }

   /* Assign the designation to the variable designation.*/
   public void empDesignation(String empDesig) {
      designation = empDesig;
   }

   /* Assign the salary to the variable	salary.*/
   public void empSalary(double empSalary) {
      salary = empSalary;
   }

   /* Print the Employee details */
   public void printEmployee() {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
      System.out.println("Salary:" + salary);
   }
}


public class Packages {
    public static void main(String args[]) {
        /* Create two objects using constructor */
        PackagesTest empOne = new PackagesTest("James Smith");
        PackagesTest empTwo = new PackagesTest("Mary Anne");
  
        // Invoking methods for each object created
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();
  
        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();
     }
}
