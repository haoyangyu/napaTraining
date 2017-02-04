package dataSetInterface;

/**
 * Created by yuhaoy on 8/9/16.
 */
public class CoinAccount implements Measurable {
    private double coinValue;

    public CoinAccount() {
        this.coinValue = 2;
    }

    @Override
    public double getMeasure() {
        return coinValue;
    }
}
