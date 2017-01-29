package cn.devlife.c05.exercises;

/**
 * Exercise 1, page 158
 *
 * @author kevin
 */
public class ConstructorTest {
    public static void main(String[] args) {
        Tester t = new Tester();
        System.out.println(t.s == null);
    }
}

class Tester {
    String s;
}