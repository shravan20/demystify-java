package StringClass;

public class StrClass {
    public static void main(String args[]) {
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);  
        System.out.println( helloString );

        int len = helloString.length();
        System.out.println( "String Length is : " + len );

        System.out.println("My name is ".concat("Zara"));
        String byeString = helloString;
        System.out.println(helloString.compareToIgnoreCase( byeString )); // returns a negative integer, zero, or a positive integer as the specified String is greater than, equal to, or less than this String, ignoring case considerations


        String str1 = "Strings are immutable";
        String str2 = "Strings are immutable";
        String str3 = "Integers are not immutable";
        
        int result = str1.compareTo( str2 );
        System.out.println(result);
        
        result = str2.compareTo( str3 );
        System.out.println(result);
        
        result = str3.compareTo( str1 );
        System.out.println(result);

        char resultChar = str2.charAt(8);
        System.out.println(resultChar);

     }
}
