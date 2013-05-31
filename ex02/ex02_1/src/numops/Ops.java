package numops;
/**
 * Some operations on integer arrays
 */

class Ops  {
    /**
     * The average of an array of integers
     * @param is The array to average
     * @return The calculated mean
     */
    public int mean(int[] is) {
        int res = 0;
        for (int idx = 0; idx < is.length; idx++) {
            res += is[idx];
        }
        return res/is.length;
    }
    /**
     * The sum of an array of integers
     * @param is The array to sum up 
     * @return The calculated sum
     */
    public int sum(int is) {
        return is;
    }
}
