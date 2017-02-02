package cn.devlife.c05.exercises;

/**
 * Exercise 3, page 167
 *
 * @author kevin
 */
public class DefaultConstructorTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
    }
}

class Cat {
    public Cat() {
        System.out.println("miao~");
    }
}