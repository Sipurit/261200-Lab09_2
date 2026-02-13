package oop.lsp;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates Liskov Substitution Principle.
 */
public class Lab09_2 {

    public static void main(String[] args) {

        // Polymorphic collection using base interface
        List<Moveable> birds = new ArrayList<>();
        birds.add(new Penguin());
        birds.add(new Ostrich());
        birds.add(new Sparrow());
        birds.add(new Eagle());

        // All birds can move safely (LSP)
        for (Moveable bird : birds) {
            bird.move();
        }

        System.out.println("---- Flying birds ----");

        // Only Flyable birds are used here
        List<Flyable> flyingBirds = new ArrayList<>();
        flyingBirds.add(new Sparrow());
        flyingBirds.add(new Eagle());

        for (Flyable bird : flyingBirds) {
            bird.fly();
        }
    }
}
