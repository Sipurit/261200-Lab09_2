package oop.lsp;

public interface Moveable {
    void move();
}

/*
 * Moveable represents any bird that can move.
 * This abstraction is minimal and safe for all birds.
 * LSP: All subclasses can be substituted without errors.
 */
