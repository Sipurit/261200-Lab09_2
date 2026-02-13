package oop.lsp;

public interface Flyable extends Moveable { // Make Flyable creature able to Move but Only moveable creature cant fly
    void fly();                             // this is How the hierarchy avoids runtime errors or logical issues
}

/*
 * Flyable extends Moveable.
 * Only birds that can actually fly implement this interface.
 * LSP: No non-flying bird is forced to implement fly().
 */