package oop.lsp;

public class Penguin implements Moveable{ // implements moveable mean only able to move and cant fly
    @Override                              // LSP respected: Penguin is never treated as Flyable.
    public void move() {
        System.out.println("Penguin is Moving");
    }
}
