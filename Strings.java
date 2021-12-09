
/*
Write a java program to implement a class String with method named swapPairs that
accepts a string as parameter and returns that String with each pair of elements of 
adjacent letters are reversed. If the String has an odd number of letters, the last letter is unchanged.
 E.g. forget becomes ofgrte and hello there returns ehll ohtree
*/
import java.util.Scanner;

public class Strings {
    public String swapPairs(String str) {
        int last, len = str.length();
        char ch1, ch2;
        if (len % 2 == 0)
            last = len - 1;
        else
            last = len - 2;
        StringBuffer sc = new StringBuffer(str);
        for (int i = 0; i < last; i = i + 2) {
            ch1 = sc.charAt(i);
            ch2 = sc.charAt(i + 1);
            sc.setCharAt(i, ch2);
            sc.setCharAt(i + 1, ch1);
        }
        return sc.toString();
    }

    public static void main(String[] args) {
        String str, swappedString;
        Scanner sc = new Scanner(System.in);
        Strings obj = new Strings();
        System.out.println("Enter a string");
        str = sc.nextLine();
        swappedString = obj.swapPairs(str);
        System.out.println("The original string=" + str);
        System.out.println("The swapped string=" + swappedString);
        sc.close();
    }
}
