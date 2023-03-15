package rover;

public class MarsRover {

    private int x;
    private int y;

    public int x_length = 42;

    public int y_length = 42;
    private Direction direction;
    public MarsRover(int pos_x, int pos_y){
        this.x = pos_x % x_length;
        this.y = pos_y % y_length;
    }

    public MarsRover(DirectionTag dir){
        if(dir.equals(DirectionTag.N)){
            direction = new North();
        } else {
            if(dir.equals(DirectionTag.S)){
                direction = new South();
            } else {
                if(dir.equals(DirectionTag.E)){
                    direction = new East();
                } else {
                    if(dir.equals(DirectionTag.W)){
                        direction = new West();
                    }
                }
            }
        }
    }

    public MarsRover(int pos_x, int pos_y, DirectionTag dir){
        this(dir);
        x = pos_x % x_length;
        y = pos_y % y_length;
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

    public void moveForward(){
        x = (x + direction.getForwardTranslationX()) % x_length;
        y = (y + direction.getForwardTranslationY()) % y_length;
    }

    public void moveBackward(){
        x = (x - direction.getForwardTranslationX()) % x_length;
        y = (y - direction.getForwardTranslationY()) % y_length;
    }

    public void turnLeft(){
        direction = direction.getLeftDirection();
    }

    public void turnRight(){
        direction = direction.getRightDirection();
    }
}
