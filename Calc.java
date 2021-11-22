
/*Program to create the equivalent of a four-function calculator.
Program requires user to enter two numbers and an operator and calculates and displays the result */
import java.io.*;

public class Calc {
    public void calculate(double a, double b, char op) {
        double result = 0.0;
        if (op == '+')
            result = a + b;
        else if (op == '-')
            result = a - b;
        else if (op == '*')
            result = a * b;
        else if (op == '/')
            result = a / b;
        else
            System.out.println("Invalid Operator!");

        System.out.println("Result: " + result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double x = 0.0, y = 0.0;
        char ch;
        Calc c = new Calc();
        System.out.println("Enter two values and an operator");
        x = Double.parseDouble(br.readLine());
        y = Double.parseDouble(br.readLine());
        ch = (char) br.read();
        c.calculate(x, y, ch);
    }
}
