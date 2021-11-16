
//Write a program to find slope of a line. Accept the coordiantes from user.
import java.util.*;

public class Slope {
    public static void main(String[] args) {
        double slope, x1 = 0.0, x2 = 0.0, y1 = 0.0, y2 = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x and y coordinate of first point");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();

        System.out.println("Enter x and y coordinate of second point");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        slope = (y2 - y1) / (x2 - x1);
        System.out.println("Points: (" + x1 + "," + y1 + ")\t" + "(" + x2 + "," + y2 + ")\tSlope:" + slope);
        sc.close();
    }
}
