package com.example.cat;

import com.example.cat.common.*;

public class CatTest {
    public static void main(String[] args) {
        Cat p1 = new WetCat();
        Cat p2 = new CoalCat();

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
        System.out.println();

        System.out.println(p1.takeDamage(p2)); // p2 attacks p1.
    }
}
