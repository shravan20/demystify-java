package JavaBasics.ObjectsClasses;

public class Puppy {

   private String name;
   private int puppyAge;

   public Puppy(String name) {
       // This constructor has one parameter, name.
       System.out.println("Maiden Name is :" + name );
       this.name = name;
    }
    
    public int getAge( ) {
      System.out.println("Puppy's age is :" + puppyAge );
      return puppyAge;
   }
    
    private void setName(String name) {
      this.name=name;
   }

    private void getName() {
       System.out.println(this.name);
    }

    public static void main(String []args) {
   
       Puppy myPuppy = new Puppy( "tommy" );
       myPuppy.setName("Jimmy");
       myPuppy.getName();
       myPuppy.getAge();

    }
 }