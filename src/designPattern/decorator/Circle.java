package designPattern.decorator;

/**
 * Created by yuhaoy on 2/4/17.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: I am Circle");
    }
}
