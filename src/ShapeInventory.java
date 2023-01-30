import java.util.ArrayList;
import java.util.List;

class ShapeInventory {
    private List<Shape> shapes = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
        notifyObservers(shape);
    }

    private void notifyObservers(Shape shape) {
        for (Observer observer : observers) {
            observer.update(shape);
        }
    }

    public Shape getTotalArea() {
        ShapeGroup totalArea = new ShapeGroup();
        for (Shape shape : shapes) {
            totalArea.addShape(new AreaPrinterDecorator(shape));
        }
        return totalArea;
    }
}
