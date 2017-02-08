package designPattern.observer;

/**
 * Created by yuhaoy on 2/4/17.
 */
public class BinaryObserver extends Observer {
    BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary " + Integer.toBinaryString(subject.getState()));
    }
}
