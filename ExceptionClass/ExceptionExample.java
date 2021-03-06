package ExceptionClass;

public class ExceptionExample {
    
    public static void main(String args[]) {
        try {
            int num[] = {1, 2, 3, 4};
            System.out.println(num[5]);            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("ErrorMessage"+e.getMessage());
            System.out.println("ErrorObj:"+ e.toString());
        }

     }

}
