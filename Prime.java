import java.io.*;
public class Prime {
    public void check(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        if (count == 2) // a prime number is a number which is divisible by 1 and itself
            System.out.println("The number " + num + " is a prime number");
        else
            System.out.println("The number " + num + " is not a prime number");
    }

    public static void main(String[] args) throws IOException {
        int num;
        Prime p = new Prime();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        num = Integer.parseInt(br.readLine());
        p.check(num);
    }
}
