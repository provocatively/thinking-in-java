package cn.devlife.c05.exercises;

/**
 * Exercise 20, page 204
 *
 * @author kevin
 */
public class VarargTest2 {
    public static void main(String... args) {
        for(String s : args)
            System.out.print(s + " ");
        System.out.println();
    }
}
