class ShapeFactory {
    public Shape createShape(String type, double... parameters) {
        switch (type) {
            case "rectangle":
                return new Rectangle(parameters[0], parameters[1]);
            case "circle":
                return new Circle(parameters[0]);
            default:
                throw new IllegalArgumentException("Invalid shape type.");
        }
    }
}
