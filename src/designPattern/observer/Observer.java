package designPattern.observer;

/**
 * Created by yuhaoy on 2/4/17.
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
