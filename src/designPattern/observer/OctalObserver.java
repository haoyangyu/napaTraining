package designPattern.observer;

/**
 * Created by yuhaoy on 2/4/17.
 */
public class OctalObserver extends Observer {
    OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal " + Integer.toOctalString(subject.getState()));
    }

}
