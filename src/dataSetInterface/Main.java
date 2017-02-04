package dataSetInterface;

import java.util.*;
import java.util.logging.Logger;

/**
 * Created by yuhaoy on 8/9/16.
 */

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    static void printCollection(Collection c) {
        Iterator i = c.iterator();
        for (int k = 0; k < c.size(); k++) {
            try {
                System.err.println(i.next());
            } catch (NoSuchElementException e) {
                System.err.println("No value: " + e.getMessage());
            }

        }
    }

    public static void main(String[] args) {
        DataSet dataSet = new DataSet();
        dataSet.add(new BankAccount(1));
        dataSet.add(new CoinAccount());

        LOGGER.info("Logger name: " + LOGGER.getName());
        LOGGER.info("Return the max number: " + dataSet.getMaximum().getMeasure());
//        System.out.println(String.format("%s", dataSet.getMaximum().getMeasure()));
//        System.out.println(String.format("%s", dataSet.getCount()));
//        System.out.println(String.format("%s", dataSet.getSum()));

        comparator comparatorObject = new comparator();
        LOGGER.info(String.valueOf(comparatorObject.compare("haoyang", "hao")));

        List<String> supplierName = new ArrayList<>();
        supplierName.add("Hao");
        supplierName.add("Yang");

        printCollection(supplierName);
    }
}
