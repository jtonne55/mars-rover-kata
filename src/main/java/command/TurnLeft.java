package command;

import rover.MarsRover;

public class TurnLeft extends Command {

    public void execute(MarsRover bot) {
        bot.turnLeft();
    }

}