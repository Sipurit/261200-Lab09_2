package oop.lps;

public interface Flyable extends Moveable { // Make Flyable creature able to Move but Only moveable creature cant fly
    void fly();                             // this is How the hierarchy avoids runtime errors or logical issues
}