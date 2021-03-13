package JavaBasics.JavaPackagesTwo;

public class Packages {

    String name;
    int age;
    String designation;
    double salary;

    public Packages(String name){
        this.name = name;
    }

    public void empAge(int age){
        age = age;
    }

    public void empDesignation(String empDesig) {
        designation = empDesig;
     }

     public void empSalary(double empSalary) {
        salary = empSalary;
     }

     public void printEmployee() {
        System.out.println("Name:"+ name );
        System.out.println("Age:" + age );
        System.out.println("Designation:" + designation );
        System.out.println("Salary:" + salary);
     }
    
}