/**
 * 
 */
package menu;

import java.util.*;

/**
 * @author jakobro
 *
 */
public class Menu {
    private final List<Entry> entries = new LinkedList<Entry>();

    /**
     * @return a copy of the list of entries.
     */
    public List<Entry> getEntries() {
    	List<Entry> result = new ArrayList<Entry>();
    	result.addAll(entries);
        return result;
    }
}
