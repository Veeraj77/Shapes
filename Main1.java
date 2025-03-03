import java.util.*;
class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        // Menu driven program loop
        do {
            System.out.println("Select Shape:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            
            switch(choice) {
                case 1:
                    // Rectangle input and calculations
                    System.out.print("Enter length: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scan.nextDouble();
                    Rectangle rec = new Rectangle(length, width);
                    System.out.println("Area: " + rec.calculateArea());
                    System.out.println("Perimeter: " + rec.calculatePerimeter());
                    break;
