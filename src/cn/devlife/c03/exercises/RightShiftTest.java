package cn.devlife.c03.exercises;

/**
 * Exercise 11, page 116
 *
 * @author kevin
 */
public class RightShiftTest {
    public static void main(String [] args) {
        int h = 0x10000000;
        System.out.println(Integer.toBinaryString(h));
        for(int i = 0; i < 28; i++) {
            h >>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
    }
}
