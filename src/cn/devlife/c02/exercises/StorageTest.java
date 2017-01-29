package cn.devlife.c02.exercises;

/**
 * Exercise 6, page 90
 *
 * @author kevin
 */
public class StorageTest {
    public static void main(String[] args) {
        class StoreStuff {
            int storage(String s) {
                return s.length() * 2;
            }
        }
        StoreStuff x = new StoreStuff();
        System.out.println(x.storage("hi"));
    }
}
