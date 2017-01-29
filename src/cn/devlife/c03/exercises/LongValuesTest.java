package cn.devlife.c03.exercises;

/**
 * Exercise 8, page 109
 *
 * @author kevin
 */
public class LongValuesTest {
    public static void main(String[] args) {
        long n1 = 0xff3f; // hexadecimal
        long n2 = 077577; // octal
        System.out.println("long n1 in hex = " + Long.toBinaryString(n1));
        System.out.println("long n2 in oct = " + Long.toBinaryString(n2));
    }
}
