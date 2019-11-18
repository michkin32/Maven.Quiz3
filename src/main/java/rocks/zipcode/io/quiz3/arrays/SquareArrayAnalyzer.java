package rocks.zipcode.io.quiz3.arrays;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
//        Integer[] secondArray = new Integer[squaredValues.length];
        for (int i = 0; i < squaredValues.length -1; i++){
            for(int j = 1; j < squaredValues.length -1; j++){
                Integer hold = squaredValues[i];
                if (squaredValues[i] < squaredValues[j]){
                    squaredValues[i] = squaredValues[j];
                    squaredValues[j] = hold;
                }
            }

        }

        for (int i = 0; i < inputArray.length -1; i++){
            if (inputArray[i] != (squaredValues[i] * squaredValues[i])) {
                return false;
            }
            }

        return true;
    }
    public void sorter(){

    }
}
