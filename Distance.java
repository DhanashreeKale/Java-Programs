
/*
Write a java program to enter coordinates of four points and
print which point is farthest from first point.
 */
import java.util.*;

public class Distance {

    public double compute(double a1, double b1, double a2, double b2) {
        double distance;
        distance = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
        return distance;
    }

    public static void main(String[] args) {
        double x1, x2, x3, x4, y1, y2, y3, y4, dist1, dist2, dist3;

        Scanner sc = new Scanner(System.in);
        Distance dis = new Distance();

        System.out.println("Enter first point(x1,y1)");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();

        System.out.println("Enter second point(x2,y2)");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        System.out.println("Enter third point(x3,y3)");
        x3 = sc.nextDouble();
        y3 = sc.nextDouble();

        System.out.println("Enter fourth point(x4,y4)");
        x4 = sc.nextDouble();
        y4 = sc.nextDouble();

        // To check which point is the farthest from the first point
        dist1 = dis.compute(x1, y1, x2, y2);
        dist2 = dis.compute(x1, y1, x3, y3);
        dist3 = dis.compute(x1, y1, x4, y4);

        System.out.println("Distance between point 1 and 2:" + dist1);
        System.out.println("Distance between point 1 and 3:" + dist2);
        System.out.println("Distance between point 1 and 4:" + dist3);
        if (dist1 >= dist2 && dist1 >= dist3)
            System.out.println("Point 2 is farthest from Point 1");
        else if (dist2 >= dist1 && dist2 >= dist3)
            System.out.println("Point 3 is farthest from Point 1");
        else
            System.out.println("Point 4 is farthest from Point 1");

        sc.close();
    }
}
