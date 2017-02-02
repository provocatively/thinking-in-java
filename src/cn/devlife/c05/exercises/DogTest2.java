package cn.devlife.c05.exercises;

/**
 * Exercise 6, page 167
 *
 * @author kevin
 */
public class DogTest2 {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
        dog2.bark('c', 1);
        dog2.bark(1, 'c');
    }
}

class Dog2 {
    public void bark(int i, char c) {
        System.out.println("barking");
    }
    public void bark(char c, int i) {
        System.out.println("howling");
    }

}
