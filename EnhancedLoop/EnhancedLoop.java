package EnhancedLoop;

public class EnhancedLoop {
    public static void main(String args[]) {
        int [] numbers = {10, 20, 30, 40, 50};
  
        for(int num : numbers ) {
           System.out.print( num );
           System.out.print(",");
        }
        
        System.out.print("\n");
        String [] names = {"James", "Larry", "Tom", "Lacy"};
  
        for( String name : names ) {
           System.out.print( name );
           System.out.print(",");
        }
     }
}
