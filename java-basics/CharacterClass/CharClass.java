package JavaBasics.CharacterClass;

public class CharClass {
    

    public static void main(String args[]) {

        char ch1 = 'a';

        // Unicode for uppercase Greek omega character
        char uniChar = '\u039A'; 
    
        // an array of chars
        char[] charArray ={ 'a', 'b', 'c', 'd', 'e' }; 
    
        // Here following primitive char 'a'
        // is boxed into the Character object ch
        Character ch2 = 'a';
    
        // Here primitive 'x' is boxed for method test,
        // return is unboxed to char 'c'
        // char c = test('x');

        System.out.println("She said \"Hello!\" to me.");

        System.out.println("ch1:"+ch1+"\nch2:"+ch2+"\nuniChar:"+uniChar+"\ncharArray:"+charArray[0]);
    }


}
