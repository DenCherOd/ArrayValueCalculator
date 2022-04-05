package arrayCalculator;

import exceptions.MyArrayDataException;
import exceptions.MySizeArrayException;

public class ArrayValueCalculator {

    public int doCalc(String[][] array) throws MySizeArrayException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4) {
            throw new MySizeArrayException("Error. Array size isn`t 4.");
        }
        for (int g = 0; g < array.length; g++) {
            for (int v = 0; v < array[g].length; v++) {
                try {
                    sum += Integer.parseInt(array[g][v]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(g, v);
                }
            }
        }
        return sum;
    }
}