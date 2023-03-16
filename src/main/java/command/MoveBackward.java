package command;

import rover.MarsRover;
import exception.ObstacleException;

public class MoveBackward extends Command {

    public void execute(MarsRover bot) throws ObstacleException {

        if(bot.ifMoveBackwardIsAnObstacle()){
            throw new ObstacleException();
        }

        bot.moveBackward();
    }

}
