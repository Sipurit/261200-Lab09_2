package oop.lsp;

public class Sparrow implements Flyable{ // implements Flyable mean moveable+flyable
    @Override
    public void move() {
        System.out.println("Sparrow is Moving");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is Flying");
    }
}
