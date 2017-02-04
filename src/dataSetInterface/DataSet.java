package dataSetInterface;

/**
 * Created by yuhaoy on 8/9/16.
 */
public class DataSet {
    private double sum;
    private Measurable maximum;
    private int count;

    public void add(Measurable measurable) {
        sum += measurable.getMeasure();
        if (count == 0 || maximum.getMeasure() < measurable.getMeasure()) {
            maximum = measurable;
        }
        count++;
    }

    public Measurable getMaximum() {
        return maximum;
    }

    public int getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }
}
