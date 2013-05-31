package accumulator;
/**
 * 
 * @author xiaop
 *
 */
public class Acc {
    private int i;
    /**
     * 
     * @param i thing to be added
     * @return sum
     */
    public int add(int i) {
        this.i += i;
        return i;
    }

    /**
     * 
     * @return addition result
     */
    public int getResult() {
        return this.i;
    }
}
