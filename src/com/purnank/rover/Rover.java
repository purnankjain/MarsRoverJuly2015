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
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Rover otherRover = (Rover) other;

        if (x != otherRover.x) return false;
        if (y != otherRover.y) return false;
        return direction == otherRover.direction;
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
            switch (direction) {
                case 0 : y++;
                    break;
                case 1 : x--;
                    break;
                case 2 : y--;
                    break;
                case 3 : x++;
                    break;
            }
        }
        else if(command.equals("LEFT")) {
            direction = (direction + 1) % 4;
        }
        else if(command.equals("RIGHT")) {
            direction = ((direction + 4) - 1) % 4;
        }
    }
}
