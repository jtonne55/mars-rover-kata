package rover;

import direction.*;
import position.Position;

import java.util.ArrayList;

public class MarsRover {

    private int x = 0;
    private int y = 0;



    /*
    * Plan by default is 42 x 42 length so x E [0,41] and y E [0,41] with a Position (x,y)
    * */
    public int x_length = 42;

    public int y_length = 42;
    private Direction direction;

    private ArrayList<Position> obstacles = new ArrayList<Position>();
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

    public MarsRover(int pos_x, int pos_y, DirectionTag dir, int x_length, int y_length){
        this(pos_x, pos_y, dir);
        this.x_length = x_length;
        this.y_length = y_length;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getX_length() {
        return x_length;
    }

    public void setX_length(int x_length) {
        this.x_length = x_length;
    }

    public int getY_length() {
        return y_length;
    }

    public void setY_length(int y_length) {
        this.y_length = y_length;
    }
    public void setDirection(Direction dir) {
        direction = dir;
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

    public void addObstacle(Position position){
        obstacles.add(position);
    }

    public Position getNextPositionForward(){
        int next_x = (x + direction.getForwardTranslationX()) % x_length;
        int next_y =  (y + direction.getForwardTranslationY()) % y_length;
        return new Position(next_x, next_y);
    }
    public Position getNextPositionBackward(){
        int next_x = (x - direction.getForwardTranslationX()) % x_length;
        int next_y =  (y - direction.getForwardTranslationY()) % y_length;
        return new Position(next_x, next_y);
    }

    public boolean ifMoveForwardIsAnObstacle(){
        Position nextPosition = getNextPositionForward();

        return ifPositionIsAnObstacle(nextPosition);
    }

    public boolean ifMoveBackwardIsAnObstacle(){
        Position nextPosition = getNextPositionBackward();

        return ifPositionIsAnObstacle(nextPosition);
    }
    public boolean ifPositionIsAnObstacle(Position current_position){

        boolean positionIsAnObstacle = obstacles.
                parallelStream().
                filter(position -> position.equals(current_position)).
                findFirst().
                isPresent();

        return positionIsAnObstacle;
    }




}
