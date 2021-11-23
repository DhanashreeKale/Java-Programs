/*
Write a program to output the following design

*
* *
* * *
* * * *
* * * * *
*/

import java.util.Scanner;

public class Triangle {
    public void design(int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++)
                System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle obj = new Triangle();
        System.out.println("Enter limit/size of traingle e.g. 4");
        int limit = sc.nextInt();
        obj.design(limit);
        sc.close();
    }
}
