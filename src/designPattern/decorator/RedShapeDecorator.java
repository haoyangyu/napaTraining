package designPattern.decorator;

/**
 * Created by yuhaoy on 2/4/17.
 */
public class RedShapeDecorator extends ShapeDecorator {
    RedShapeDecorator(Shape shapeObject) {
        super(shapeObject);
    }

    private void setRedDecoration() {
        System.out.println("Decorating red line");
    }

    @Override
    public void draw() {
        shapeObject.draw();
        setRedDecoration();
    }
}
