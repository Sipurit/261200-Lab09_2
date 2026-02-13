package oop.lsp;

public class Eagle implements Flyable{
    @Override
    public void move() {
        System.out.println("Eagle is Moving");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is Flying");
    }
}