package arrayCalculator;

import exceptions.MyArrayDataException;
import exceptions.MySizeArrayException;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"2", "3", "4", "1"},
                {"3", "1", "6", "3"},
                {"1", "5", "7", "1"},
                {"7", "4", "1", "4"}
        };
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        try {
            System.out.println(arrayValueCalculator.doCalc(array));
        } catch (MySizeArrayException e) {
            System.out.println(e);
        } catch (MyArrayDataException e) {
            System.out.println(e);
        }
    }
}