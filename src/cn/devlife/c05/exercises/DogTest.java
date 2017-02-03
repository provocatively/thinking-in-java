package cn.devlife.c05.exercises;

/**
 * Exercise 5, page 167
 *
 * @author kevin
 */
public class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        char c = 'c';
        byte b = 0;
        short s = 0;
        d.bark();
        d.bark((char)c);
        d.bark((byte)b);
        d.bark((short)s);
        d.bark(1);
        d.bark(1L);
        d.bark(1.0f);
        d.bark(1.0);
    }
}

class Dog {
    void bark() {
        System.out.println("barking");
    }

    void bark(char c) {
        System.out.println("howling");
    }

    void bark(byte b) {
        System.out.println("wang");
    }

    void bark(short s) {
        System.out.println("wu");
    }

    void bark(int i) {
        System.out.println("e");
    }

    void bark(long L) {
        System.out.println("haha");
    }

    void bark(float f) {
        System.out.println("waw");
    }

    void bark(double d) {
        System.out.println("wwu");
    }
}
