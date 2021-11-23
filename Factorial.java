import java.util.Scanner;

public class Factorial {
    public void fact(int num) {
        int fact = 1;
        if (num == 1)
            fact = 1;
        for (int i = 1; i <= num; i++)
            fact = fact * i;

        System.out.println("The factorial of " + num + "=" + fact);
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        obj.fact(n);
        sc.close();
    }
}
