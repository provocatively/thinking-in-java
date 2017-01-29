package cn.devlife.c03.exercises;

/**
 * Exercise 5&6, page 105
 *
 * @author kevin
 */
public class DogTest {
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();

        spot.setName("spot");
        spot.setSays("Ruff!");

        scruffy.setName("scruffy");
        scruffy.setSays("Wurf!");

        spot.show();
        scruffy.show();

        Dog newSpot = spot;
        System.out.println(newSpot == spot);
        System.out.println(newSpot.equals(spot));
    }
}

class Dog {
    String name;
    String says;

    public void setName(String name) {
        this.name = name;
    }

    public void setSays(String says) {
        this.says = says;
    }

    public void show() {
        System.out.println("name:" + name);
        System.out.println("says:" + says);
    }
}