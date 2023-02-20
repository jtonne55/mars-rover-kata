package rover;

public class MarsRover {

    private int x;
    private int y;
    Direction direction;
    public MarsRover(int pos_x, int pos_y){
        this.x = pos_x;
        this.y = pos_y;
    }

    public MarsRover(Direction dir){
        this.direction = dir;
    }

    public MarsRover(int pos_x, int pos_y, Direction dir){
        x = pos_x;
        y = pos_y;
        direction = dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }
}
