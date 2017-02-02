package cn.devlife.c05.exercises;

/**
 * Exercise 8, page 170
 *
 * @author kevin
 */
public class ThisTest {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.t();
    }
}

class Bird {

    public void t() {
        m();
        this.m();
    }

    private void m() {
        System.out.println("test this");
    }
}