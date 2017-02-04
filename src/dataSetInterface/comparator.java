package dataSetInterface;

import java.util.Comparator;

/**
 * Created by yuhaoy on 12/12/16.
 */

public class comparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}
