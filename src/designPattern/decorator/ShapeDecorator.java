package designPattern.decorator;

/**
 * Created by yuhaoy on 2/4/17.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape shapeObject;

    ShapeDecorator(Shape shapeObject) {
        this.shapeObject = shapeObject;
    }

    @Override
    public void draw() {
        shapeObject.draw();
    }
}
