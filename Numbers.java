
/*
A magic number is a number in which the eventual sum of digits of number is equal to 1.
E.g     172 = 1 + 7 + 2 = 10
        1 + 0 = 1
        
E.g     928 = 9 + 2 + 8 = 19
        1 + 9 = 10
        1 + 0 = 1
Design a class Numbers to check if a given number is magic number or not.
*/
import java.util.Scanner;

public class Numbers {
    int n; // stores the number

    Numbers() // default constuctor
    {
        n = 0;
    }

    int sumOfDigits(int num) {
        int digit = 0, sum = 0;
        while (num > 0) {
            digit = num % 10; // last digit
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }

    void ismagic() {
        int num = 0, sum = 0;
        sum = sumOfDigits(n);
        while (sum > 9) {
            num = sum;
            sum = sumOfDigits(num);
        }
        if (sum == 1)
            System.out.println(n + " is a Magic Number");
        else
            System.out.println(n + " is not a Magic Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numbers obj = new Numbers();
        System.out.println("Enter a number");
        obj.n = sc.nextInt();
        obj.ismagic();
        sc.close();
    }
}
