package com.purnank.rover;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class RoverControllerTest {

    @Test
    public void controllerAcceptsANewSetOfCommands() {
        RoverController controller = new RoverController(0, 0, 0);
        ArrayList<String> commands = new ArrayList<String>();
        commands.add("MOVE");

        controller.acceptMoreCommands(commands);

        assertEquals("MOVE", controller.nextCommand());
    }
}
