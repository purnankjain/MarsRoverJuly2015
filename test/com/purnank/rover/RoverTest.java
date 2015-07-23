package com.purnank.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverTest {

    @Test
    public void positionInitializedIs0And0() {
        Rover rover = new Rover(0, 0, 0);
        Rover expectedRover = new Rover(0, 0, 0);

        assertEquals(expectedRover, rover);
    }

    @Test
    public void directionIsNorthWhenInitialisedAsNorth() {
        Rover rover = new Rover(0, 0, 0);
        Rover expectedRover = new Rover(0, 0, 0);

        assertEquals(expectedRover, rover);
    }

    @Test
    public void move1PointToNorthOnMoveCommand() {
        Rover rover = new Rover(0, 0, 0);
        Rover expectedRover = new Rover(0, 1, 0);
        String command = "MOVE";

        rover.followCommand(command);

        assertEquals(expectedRover, rover);
    }

    @Test
    public void turnLeftOnLeftCommand() {
        Rover rover = new Rover(0, 0, 0);
        Rover expectedRover = new Rover(0, 0, 1);
        String command = "LEFT";

        rover.followCommand(command);

        assertEquals(expectedRover, rover);
    }
}
