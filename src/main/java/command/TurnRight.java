package command;

import rover.MarsRover;

public class TurnRight extends Command {

    public void execute(MarsRover bot) {
        bot.turnRight();
    }

}