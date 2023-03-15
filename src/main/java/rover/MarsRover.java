package rover;

public class MarsRover {

    private int x;
    private int y;
    private Direction direction;
    public MarsRover(int pos_x, int pos_y){
        this.x = pos_x;
        this.y = pos_y;
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
        x = pos_x;
        y = pos_y;
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
        x = x + direction.getForwardTranslationX();
        y = y + direction.getForwardTranslationY();
    }

    public void moveBackward(){
        x = x - direction.getForwardTranslationX();
        y = y - direction.getForwardTranslationY();
    }

    public void turnLeft(){
        direction = direction.getLeftDirection();
    }

    public void turnRight(){
        direction = direction.getRightDirection();
    }
}
