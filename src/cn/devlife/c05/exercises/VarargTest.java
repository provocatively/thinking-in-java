package cn.devlife.c05.exercises;

/**
 * Exercise 19, page 204
 *
 * @author kevin
 */
public class VarargTest {

    static void showStrings(String... args) {
        for (String s : args)
            System.out.print(s + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        showStrings("one", "TWO", "three", "four");
        showStrings(new String[]{"1", "2", "3", "4"});
    }

}
