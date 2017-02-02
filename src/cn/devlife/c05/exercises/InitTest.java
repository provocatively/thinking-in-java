package cn.devlife.c05.exercises;

/**
 * Exercise 17, page 198
 *
 * @author kevin
 */
public class InitTest {

    InitTest(String s) {
        System.out.println("InitTest()");
        System.out.println(s);
    }

    public static void main(String[] args) {
        InitTest[] it = new InitTest[10];
    }
}
