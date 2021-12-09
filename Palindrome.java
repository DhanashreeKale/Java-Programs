import java.util.Scanner;

public class Palindrome {
    public void check(int num) {
        int n, digit, rev = 0;
        n = num;
        while (n != 0) {
            digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if (num == rev)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is not Palindrome");
    }

    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        Palindrome pln = new Palindrome();
        pln.check(num);
        sc.close();
    }
}
