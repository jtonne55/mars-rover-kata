package command;

import rover.MarsRover;
import exception.ObstacleException;

public abstract class Command {

    abstract public void execute(MarsRover bot) throws ObstacleException;

}
