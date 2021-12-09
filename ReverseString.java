import java.util.*;

public class ReverseString {
    public String reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {
        String str, revStr = "";

        Scanner sc = new Scanner(System.in);
        ReverseString obj = new ReverseString();

        System.out.println("Enter a string");
        str = sc.nextLine();
        str = str.toLowerCase();
        revStr = obj.reverse(str);

        System.out.println("Original String=" + str);
        System.out.println("Reversed String=" + revStr);

        if (str.equals(revStr))
            System.out.println(str + " string is palindrome!");
        else
            System.out.println(str + " string is not palindrome!");
        sc.close();
    }

}
