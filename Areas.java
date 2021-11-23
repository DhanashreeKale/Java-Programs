
/*Write a program to output area of shapes based on users choice and input.
Shapes: square, rectangle, circle,triangle*/
import java.util.Scanner;

public class Areas {
    double area;

    public void square(double side) {
        area = side * side;
        System.out.println("Side:" + side + " Area of square=" + area);
    }

    public void rectangle(double length, double breadth) {
        area = length * breadth;
        System.out.println("Length:" + length + " Breadth:" + breadth + " Area of rectangle=" + area);
    }

    public void circle(double radius) {
        area = Math.PI * radius * radius;
        System.out.print("Radius:" + radius + " Area of circle=");
        System.out.format("%.3f \n", area);// to correct to 3 decimal point
    }

    public void triangle(double base, double height) {
        area = 0.5 * base * height;
        System.out.print("Base:" + base + " Height:" + height + " Area of triangle=" + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Areas obj = new Areas();
        int choice;
        do {
            System.out.println("Enter 1:Area of square");
            System.out.println("Enter 2:Area of rectangle");
            System.out.println("Enter 3:Area of circle");
            System.out.println("Enter 4:Area of triangle");
            System.out.println("Enter 5:To exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                double side;
                System.out.println("Enter side of the square");
                side = sc.nextDouble();
                obj.square(side);
                break;
            case 2:
                double length, breadth;
                System.out.println("Enter length and breadth of the rectangle respectively");
                length = sc.nextDouble();
                breadth = sc.nextDouble();
                obj.rectangle(length, breadth);
                break;
            case 3:
                double radius;
                System.out.println("Enter radius of the circle");
                radius = sc.nextDouble();
                obj.circle(radius);
                break;
            case 4:
                double base, height;
                System.out.println("Enter base and height of the triangle respectively");
                base = sc.nextDouble();
                height = sc.nextDouble();
                obj.triangle(base, height);
                break;
            case 5:
                System.out.println("Thank you! Bye");
                break;
            default:
                System.out.println("Enter valid input");
            }
        } while (choice != 5);
        sc.close();
    }
}
