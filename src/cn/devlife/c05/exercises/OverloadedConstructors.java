package cn.devlife.c05.exercises;

/**
 * Exercise 9, page 172
 *
 * @author kevin
 */
public class OverloadedConstructors {
    public static void main(String[] args) {
        Over over = new Over();
    }
}

class Over {
    public Over() {
        this("sdf");
    }

    public Over(String s) {
        System.out.println(s);
    }
}