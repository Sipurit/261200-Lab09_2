package oop.lps;

public class Penguin implements Moveable{ // implements moveable mean only able to move and cant fly
    @Override
    public void move() {
        System.out.println("Penguin is Moving");
    }
}
