package cn.devlife.c05.exercises;

/**
 * Exercise 2, page 158
 *
 * @author kevin
 */
public class ConstructorTest2 {
    public static void main(String[] args) {
        Tester2 t = new Tester2();
        System.out.println("t.s1: " + t.s1);
        System.out.println("t.s2: " + t.s2);
        System.out.println("t.s3: " + t.s3);
    }
}

class Tester2 {
    String s1;
    String s2 = "hello";
    String s3;

    Tester2() {
        System.out.println("Before constructor, s1:" + s1);
        System.out.println("Before constructor, s2:" + s2);
        System.out.println("Before constructor, s3:" + s3);
        s3 = "world";
    }
}
