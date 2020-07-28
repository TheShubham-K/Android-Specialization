package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO -- start your code here
    private int argOne = 0;
    private int argTwo = 0;

    //Multiply
    public Multiply(int argumentOne, int argumentTwo){
        argOne = argumentOne;
        argTwo = argumentTwo;
    }

    public String toString(){
        return String.valueOf(argOne*argTwo);
    }
}
