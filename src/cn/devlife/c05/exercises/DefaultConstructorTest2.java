package cn.devlife.c05.exercises;

/**
 * Exercise 4, page 167
 *
 * @author kevin
 */
public class DefaultConstructorTest2 {
    public static void main(String[] args) {
        Cat2 cat = new Cat2();
        Cat2 cat2 = new Cat2("ao~");
    }
}

class Cat2 {

    public Cat2() {
        System.out.println("miao~");
    }

    public Cat2(String s) {
        System.out.println(s);
    }
}