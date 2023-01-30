class AreaPrinterDecorator implements Shape {
    private Shape shape;

    AreaPrinterDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public double getArea() {
        double area = shape.getArea();
        System.out.println("Area: " + area);
        return area;
    }
}
