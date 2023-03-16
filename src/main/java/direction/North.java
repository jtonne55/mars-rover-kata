package direction;

public class North extends Direction{
    public North(){
        super();
        directionTag = DirectionTag.N;
    }


    public int getForwardTranslationX() {
        return 0;
    }

    public int getForwardTranslationY() {
        return 1;
    }


    public Direction getLeftDirection() {
        return new West();
    }

    @Override
    public Direction getRightDirection() {
        return new East();
    }
}
