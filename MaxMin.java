//Write a program to print the range of character,byte,short,integer,float and double

public class MaxMin {
    public static void main(String[] args) {
        System.out.println("Maximum Character Value Representable=" + (int) Character.MAX_VALUE);
        System.out.println("Minimum Character Value Representable=" + (int) Character.MIN_VALUE);

        System.out.println("Maximum Byte Value Representable=" + Byte.MAX_VALUE);
        System.out.println("Minimum Byte Value Representable=" + Byte.MIN_VALUE);

        System.out.println("Maximum Short Value Representable=" + Short.MAX_VALUE);
        System.out.println("Minimum Short Value Representable=" + Short.MIN_VALUE);

        System.out.println("Maximum Integer Value Representable=" + Integer.MAX_VALUE);
        System.out.println("Minimum Integer Value Representable=" + Integer.MIN_VALUE);

        System.out.println("Maximum Flaot Value Representable=" + Float.MAX_VALUE);
        System.out.println("Minimum Flaot Value Representable=" + Float.MIN_VALUE);

        System.out.println("Maximum Double Value Representable=" + Double.MAX_VALUE);
        System.out.println("Minimum Double Value Representable=" + Double.MIN_VALUE);

    }

}
/* OUTPUT
Maximum Character Value Representable=65535
Minimum Character Value Representable=0
Maximum Byte Value Representable=127
Minimum Byte Value Representable=-128
Maximum Short Value Representable=32767
Minimum Short Value Representable=-32768
Maximum Integer Value Representable=2147483647
Minimum Integer Value Representable=-2147483648
Maximum Flaot Value Representable=3.4028235E38
Minimum Flaot Value Representable=1.4E-45
Maximum Double Value Representable=1.7976931348623157E308
Minimum Double Value Representable=4.9E-324
*/
