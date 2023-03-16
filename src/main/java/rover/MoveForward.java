package rover;

public class MoveForward extends Command {

    void execute(MarsRover bot) throws ObstacleException {

        if(bot.ifMoveForwardIsAnObstacle()){
            throw new ObstacleException();
        }

        bot.moveForward();
    }
}
