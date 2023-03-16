package command;

import rover.MarsRover;
import exception.ObstacleException;

public class MoveForward extends Command {

    public void execute(MarsRover bot) throws ObstacleException {

        if(bot.ifMoveForwardIsAnObstacle()){
            throw new ObstacleException();
        }

        bot.moveForward();
    }
}
