package dataSetInterface;

/**
 * Created by yuhaoy on 8/9/16.
 */
public class BankAccount implements Measurable {

    private double balance;

    public BankAccount(int i) {
        this.balance = i;
    }

    public BankAccount() {
        this.balance = 10.0;
    }


    @Override
    public double getMeasure() {
        return balance;
    }
}
