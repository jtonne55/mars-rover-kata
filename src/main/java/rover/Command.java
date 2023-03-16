package rover;

public abstract class Command {

    abstract void execute(MarsRover bot) throws ObstacleException;

}
