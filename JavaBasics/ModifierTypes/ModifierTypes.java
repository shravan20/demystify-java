package JavaBasics.ModifierTypes;

public class ModifierTypes {
    private boolean myFlag;
    static final double weeks = 9.5;
    protected static final int BOXWIDTH = 42;

    public static void main(String[] arguments) {
        
        ModifierTypes obj = new ModifierTypes();
        System.out.println("Private Varibles:"+obj.myFlag);

        /**
         * First way of accessing the static variables
         */
        System.out.println("static + final:"+weeks);
        System.out.println("protected + static + final:" + BOXWIDTH);

         /**
         * First way of accessing the static variables
         */
        System.out.println("static + final:"+ModifierTypes.weeks);
        System.out.println("protected + static + final:" + ModifierTypes.BOXWIDTH);
    }
}
