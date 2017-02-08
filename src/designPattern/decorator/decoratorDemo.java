package designPattern.decorator;

/**
 * Created by yuhaoy on 2/4/17.
 */
public class decoratorDemo {
    public static void main(String[] args) {
        RedShapeDecorator redShapeDecoratorCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redShapeDecoratorRect = new RedShapeDecorator(new Rectangle());
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.draw();
        redShapeDecoratorCircle.draw();

        rectangle.draw();
        redShapeDecoratorRect.draw();
    }
}
