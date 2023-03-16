package direction;

public class West extends Direction {
    public West(){
        super();
        directionTag = DirectionTag.W;
    }

    public int getForwardTranslationX() {
        return -1;
    }

    public int getForwardTranslationY() {
        return 0;
    }

    public Direction getLeftDirection() {
        return new South();
    }

    public Direction getRightDirection() {
        return new North();
    }
}
