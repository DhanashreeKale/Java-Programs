
//Fibonacci series 0 1 1 2 3 5 8........
import java.util.Scanner;
public class Fibo {

    public void fibo(int limit) {
        int first, second, third;
        first = 0;
        second = 1;
        System.out.print(first + "," + second);
        for (int i = 2; i < limit; i++) {
            third = first + second;
            System.out.print(" ," + third);
            first = second;
            second = third;
        }
    }

    public static void main(String[] args) {
        int limit;
        Fibo fibo = new Fibo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many fibonacci numbers you want");
        limit = sc.nextInt();
        fibo.fibo(limit);
        sc.close();
    }
}
