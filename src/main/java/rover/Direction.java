package rover;

public  abstract class Direction {

    protected DirectionTag directionTag;

    public DirectionTag getDirectionTag(){
        return directionTag;
    }

    abstract int getForwardTranslationX();

    abstract int getForwardTranslationY();

    abstract Direction getLeftDirection();

    abstract Direction getRightDirection();
}
