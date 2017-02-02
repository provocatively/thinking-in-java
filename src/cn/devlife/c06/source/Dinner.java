package cn.devlife.c06.source;

// Uses the library.

import cn.devlife.c06.source.dessert.Cookie;

public class Dinner {
    public static void main(String[] args) {
        Cookie x = new Cookie();
        //! x.bite(); // Can't access
    }
}

/* Output:
Cookie constructor
*/
