package designPattern.factory;

/**
 * Created by yuhaoy on 2/4/17.
 */
public class ShapeFactory {

    public Shape getShape(String shapeName) {
        if (shapeName == null) return null;
        if (shapeName.equalsIgnoreCase("CIRCLE")) return new Circle();
        else if (shapeName.equalsIgnoreCase("SQUARE")) return new Square();
        else if (shapeName.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        return null;
    }
}
