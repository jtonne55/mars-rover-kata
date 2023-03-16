package exception;

import position.Position;

public class ObstacleException extends Exception {

    public String toString(Position position) {
        return "Obstacle encountered at Position(x="+position.getX()+",y="+position.getY()+")";
    }
}
