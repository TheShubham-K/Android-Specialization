package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    private int mArgumentOne = 0;
    private int mArgumentTwo = 0;

    //Divide
    public Divide(int argumentOne, int argumentTwo){
        mArgumentOne = argumentOne;
        mArgumentTwo = argumentTwo;
    }

    public String toString(){
        return String.valueOf(mArgumentTwo/mArgumentTwo) + " R:"+ String.valueOf(mArgumentOne%mArgumentTwo);
    }
}
