class AddShapeCommand implements Command {
    private ShapeInventory inventory;
    private Shape shape;

    AddShapeCommand(ShapeInventory inventory, Shape shape) {
        this.inventory = inventory;
        this.shape = shape;
    }

    @Override
    public void execute() {
        inventory.addShape(shape);
    }
}
