//rectangle.java

import java.lang.Math;
class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width, 0, 3);  
    }
    public double calculateArea() {
        return  dim_one * dim_two;  
    }
