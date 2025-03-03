// Circle.java
// Circle class extending Shape
class Circle extends Shape {
    public Circle(double radius) {
        super(radius, 0, 0, 1);
    }
    public double calculateArea() {
        return Math.PI * dim_one * dim_one;
    }
