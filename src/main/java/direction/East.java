package direction;

public class East extends Direction{
    public East(){
        super();
        directionTag = DirectionTag.E;
    }


    public int getForwardTranslationX() {
        return 1;
    }

    public int getForwardTranslationY() {
        return 0;
    }

    public Direction getLeftDirection() {
        return new North();
    }

    public Direction getRightDirection() {
        return new South();
    }
}