package ca.bcit.comp1451.a00898485;

/**
 * class Knight
 * @author Xin Zhao (A00898485) with Saiedeh Zabihirad
 * @version 1.0
 */

public class Knight extends ChessPiece{
    /**
     * Constructor for objects of class Knight.
     * @param whiteColor A boolean to set if the Knight is white or not.
     * @param value An integer to set the value of the Knight.
     */
    public Knight(boolean whiteColor, int value) {
        super(whiteColor, KNIGHT);
    }

    /**
     * Displays a particular chess piece move.
     */
    @Override
    public void move() {
        System.out.println(this.getClass().getSimpleName() + "  \"like an L\"");
    }

    /**
     * Overrides the toString() method and returns the name of its class in addition to its value.
     */
    @Override
    public String toString() {
        String result = super.toString() + "(" + this.getValue() + ")";
        return result;
    }
}