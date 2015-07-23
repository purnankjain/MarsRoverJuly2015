package com.purnank.rover;

public class Rover {
    private int x;
    private int y;

    public Rover(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Rover otherRover = (Rover) other;

        if (x != otherRover.x) return false;
        return y == otherRover.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
