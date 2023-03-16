package direction;

public class South extends Direction{
    public South(){
        super();
        directionTag = DirectionTag.S;
    }


    public int getForwardTranslationX() {
        return 0;
    }

    public int getForwardTranslationY() {
        return -1;
    }


    public Direction getLeftDirection() {
        return new East();
    }

    public Direction getRightDirection() {
        return new West();
    }
}
