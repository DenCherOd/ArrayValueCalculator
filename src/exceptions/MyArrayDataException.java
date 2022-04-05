package exceptions;

public class MyArrayDataException extends Exception {
    private int g;
    private int v;

    public MyArrayDataException(int g, int v) {
        this.g = g;
        this.v = v;
    }

    public String toString() {
        return "Error. Wrong type of array element under index:"
                + g + " " + v;
    }
}
