package designPattern.factory;

/**
 * Created by yuhaoy on 2/4/17.
 */
public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //create circle object
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
    }
}
