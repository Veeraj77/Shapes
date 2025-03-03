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
            
