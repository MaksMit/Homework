Homework is a practical part of the training. It's mission is to consolidate received knowledge from online course in
practice:

Task:
You are free to decide the context and task itself (e.g., create an inventory management system for various 2-d shapes)
The solution must make use of at least 1 creational GoF pattern, 1 behavioral GoF pattern, and 1 structural GoF pattern
The solution must use at least 4 non-creational GoF patterns in total

Implementation Guidelines:
Create a GitHub repository for the assignment
Don’t use any input from the user at all. If you wish to achieve dynamic behavior, use random numbers
All output should be printed to standard console output
Keep it simple. Your goal is to demonstrate how to implement patterns for your solution, everything else is secondary

**Creational pattern: Factory Method**

interface Shape {}

class Rectangle implements Shape {}

class Circle implements Shape {}

class ShapeFactory {}

**Behavioral pattern: Observer**

interface Observer {}

class InventoryObserver implements Observer {}

**Behavioral pattern: Command**

interface Command {}

class AddShapeCommand implements Command {}

**Structural pattern: Composite**

class ShapeGroup implements Shape {}

**Structural pattern: Decorator**

class AreaPrinterDecorator implements Shape {}

class ShapeInventory {}
