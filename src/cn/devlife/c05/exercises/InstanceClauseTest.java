package cn.devlife.c05.exercises;

/**
 * Exercise 15, page 193
 *
 * @author kevin
 */
public class InstanceClauseTest {
    public static void main(String[] args) {
        new T();
    }
}

class T {
    String s;

    {
        s = "Initializing string in Tester";
        System.out.println(s);
    }

    T() {
        System.out.println("Tester()");
    }
}