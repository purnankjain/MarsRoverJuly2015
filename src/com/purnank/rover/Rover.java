package com.purnank.rover;


public class Rover {
    private int x;
    private int y;
    private int direction;

    public Rover(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (x != rover.x) return false;
        if (y != rover.y) return false;
        return direction == rover.direction;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + direction;
        return result;
    }

    public void followCommand(String command) {
        if(command.equals("MOVE")) {
            y++;
        }
        else if(command.equals("LEFT")) {
            direction++;
        }
    }
}
