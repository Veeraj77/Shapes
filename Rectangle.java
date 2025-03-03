//rectangle.java

import java.lang.Math;

class Rectangle extends Shape {
    
    public Rectangle(double length, double width) {
        super(length, width, 0, 3);  
    }

    // Calculate area of the triangle
    public double calculateArea() {
        return  dim_one * dim_two;  
    }

    // Calculate perimeter
    public double calculatePerimeter() {
        return 2*(dim_one+dim_two);
    }
}
