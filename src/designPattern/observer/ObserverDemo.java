package designPattern.observer;

/**
 * Created by yuhaoy on 2/4/17.
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        //register the subject
        new BinaryObserver(subject);
        new OctalObserver(subject);

        System.out.println("State initial");
        subject.setState(3);
        System.out.println("State changed");
        subject.setState(1);
    }
}
