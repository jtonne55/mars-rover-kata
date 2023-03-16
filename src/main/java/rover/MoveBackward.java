package rover;

public class MoveBackward extends Command {

    void execute(MarsRover bot) throws ObstacleException {

        if(bot.ifMoveBackwardIsAnObstacle()){
            throw new ObstacleException();
        }

        bot.moveBackward();
    }

}
