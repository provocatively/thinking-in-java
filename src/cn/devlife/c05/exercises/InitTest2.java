package cn.devlife.c05.exercises;

/**
 * Exercise 18, page 198
 *
 * @author kevin
 */
public class InitTest2 {
    public static void main(String[] args) {
        InitTest[] it = new InitTest[5];
        for(int i = 0; i < it.length; i++)
            it[i] = new InitTest(Integer.toString(i));
    }
}
