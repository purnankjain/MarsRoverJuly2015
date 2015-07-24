package com.purnank.rover;


import java.util.ArrayList;

public class RoverController {

    Rover rover;
    ArrayList<String> commandList;

    public RoverController(int x, int y, int direction) {
        rover = new Rover(x, y, direction);
        commandList = new ArrayList<String>();
    }


    public void acceptMoreCommands(ArrayList<String> commands) {
        for(String command : commands) {
            commandList.add(command);
        }
    }

    public String nextCommand() {
        return "MOVE";
    }
}
