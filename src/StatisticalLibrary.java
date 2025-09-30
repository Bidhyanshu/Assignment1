import java.util.ArrayList;
import java.util.Collections;



/**
 * Library of Statistical Calculations
 * Includes functions for finding the minimum value, maximum value, median value and the mean
 */


/**
 * 5.2.3 Method names
 * 4.1.2 Braces
 * 5.2.3 Method names
 * 4.2 Block indentation
 * 4.6.1 Vertical whitespace
 * 5.2.5 Variable names
 * 4.6.2 Horizontal whitespace
 * 7.1.1 Javadoc
 *
 * @author 000933144 Bidhyanshu Poudel
 * @version 2.0
 */



public class StatisticalLibrary {


    /** *Calculates mean of values above 0
     *  @param list the list of Double value
     *  @return the mean value of the selected elements
     */

    public static double calculateMean(ArrayList<Double> list) { // removed variables that is not used

        double sum = 0;
        int count = 0;

        for (double value : list) {
            if (value >= 0) {
                sum += value;
                count++;
            }
        }

        return sum / count;
    }

    /**
     * Calculates the median of the values in the list.
     * @param list the list of Double values
     * @return the median value
     */
    public static double calculateMedian(ArrayList<Double> list) {

        double median;
        int size = list.size();

        if (size % 2 == 1) {
            median = size / 2;
            median = list.get((int) median);
        } else {
            median = (list.get((int) ((list.size()) / 2) - 1) + list.get((int) (list.size() / 2))) / 2;
        }

        return median;
    }

    /** * Finds the minimum value in the list.
     *  @param list the list of Double values
     *  @return the minimum value
     */
    public static double findMin(ArrayList<Double> list) {

        double min = list.get(0);

        for (double value : list) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    /**
     * Finds the maximum value in the list.
     * @param list the list of Double values
     * @return the maximum value
     */
    public static double findMax(ArrayList<Double> list) {

        double max = list.get(0);

        for (double value : list) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    /**  Main method for testing statistical methods.
     *  @param args
     */
    public static void main(String[] args) {

        ArrayList<Double> data = new ArrayList<>();
        Collections.addAll(data, 25.5, 29.4, 36.7, 43.1, 57.9, 88.3, 99.9, 100.0);

        System.out.println("Mean: " + calculateMean(data));
        System.out.println("Median: " + calculateMedian(data));
        System.out.println("Minimum: " + findMin(data));
        System.out.println("Maximum: " + findMax(data));
    }
}