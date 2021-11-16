
//Write a program to obtain the radius of a circle and calculate its perimeter.
//(Using Scanner class)
import java.util.*;

public class CirclePerimeter {
    public static void main(String[] args) {
        double radius, perimeter, pi = 3.142;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        radius = sc.nextDouble();
        perimeter = 2 * pi * radius;
        System.out.println("Perimeter of circle with radius " + radius + " is: " + perimeter);
        sc.close();
    }
}