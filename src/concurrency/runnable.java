package concurrency;

import java.util.concurrent.Executors;

/**
 * Created by yuhaoy on 12/12/16.
 */
public class runnable {
    /**
     * One can put modifiers on the parameters of a lambda expression
     * The final keyword
     * Annotations
     * It is not possible to specify the returned type of a lambda function
     */
    Runnable r = () -> {
        int i = 0;
        while (i++ < 10) {
            System.out.println("It works");
        }
    };

    /**
     * Method reference is not static call, it is absolutely not a static call
     * It is lambda expression, it is another way to write lambda expression
     */
}
