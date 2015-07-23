package com.purnank.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void positionInitializedIs0And0() {
        Rover rover1 = new Rover(0, 0, 0);
        Rover rover2 = new Rover(0, 0, 0);

        assertEquals(rover1, rover2);
    }

    @Test
    public void directionIsNorthWhenInitialisedAsNorth() {
        Rover rover1 = new Rover(0, 0, 0);
        Rover rover2 = new Rover(0, 0, 0);

        assertEquals(rover1, rover2);
    }
}
