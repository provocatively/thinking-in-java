package cn.devlife.c03.exercises;

/**
 * Exercise 12, page 116
 *
 * @author kevin
 */
public class RightShiftTest2 {
    public static void main(String [] args) {
        int h = -1;
        System.out.println(Integer.toBinaryString(h));
        h <<= 10;
        System.out.println(Integer.toBinaryString(h));
        for(int i = 0; i < 32; i++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
    }
}
