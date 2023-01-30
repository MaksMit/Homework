import java.util.Random;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        ShapeInventory inventory = new ShapeInventory();
        inventory.addObserver(new InventoryObserver());

        Random r = new Random();
        double rangeMax = 1;
        double rangeMin = 100;
        double randomParameterA = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        double randomParameterB = rangeMin + (rangeMax - rangeMin) * r.nextDouble();

        Command addRectangleCommand = new AddShapeCommand(inventory, factory.createShape("rectangle", randomParameterA, randomParameterB));
        Command addCircleCommand = new AddShapeCommand(inventory, factory.createShape("circle", randomParameterA));

        addRectangleCommand.execute();
        addCircleCommand.execute();

        System.out.println("Total area: " + inventory.getTotalArea().getArea());
    }
}
