class InventoryObserver implements Observer {
    @Override
    public void update(Shape shape) {
        System.out.println("A new " + shape.getClass().getSimpleName() + " has been added to the inventory.");
    }
}
