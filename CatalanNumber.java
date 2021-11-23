
/*
Catalan numbers are the numbers having the form
                 (2n)!
      C(n)=   -------------
              (n!)^2 (n+1)

 */
import java.util.Scanner;

public class CatalanNumber {

    public int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        double CatalanNum;
        int n;
        Scanner sc = new Scanner(System.in);

        CatalanNumber obj = new CatalanNumber();

        System.out.println("Enter value if n from 1 to 10");
        n = sc.nextInt();

        if (n >= 1 && n <= 10) {
            for (int i = 1; i <= n; i++) {
                CatalanNum = (obj.factorial(2 * i)) / ((Math.pow(obj.factorial(i), 2)) * (i + 1));
                System.out.println(CatalanNum);
            }
        }
        sc.close();
    }
}
