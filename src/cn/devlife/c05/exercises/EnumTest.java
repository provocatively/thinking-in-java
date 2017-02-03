package cn.devlife.c05.exercises;

/**
 *Exercise 21, page 207
 *
 * @author kevin
 */
public class EnumTest {

    public enum Bills {
        ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
    }

    public static void main(String[] args) {
        for (Bills b : Bills.values())
            System.out.println(b + ", ordinal " + b.ordinal());
    }

}
