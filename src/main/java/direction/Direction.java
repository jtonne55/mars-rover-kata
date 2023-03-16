package direction;

public  abstract class Direction {

    protected DirectionTag directionTag;

    public DirectionTag getDirectionTag(){
        return directionTag;
    }

    public abstract int getForwardTranslationX();

    public abstract int getForwardTranslationY();

    public abstract Direction getLeftDirection();

    public abstract Direction getRightDirection();
}
