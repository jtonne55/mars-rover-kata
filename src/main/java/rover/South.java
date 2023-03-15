package rover;

public class South extends Direction{
    public South(){
        super();
        directionTag = DirectionTag.S;
    }


    int getForwardTranslationX() {
        return 0;
    }

    int getForwardTranslationY() {
        return -1;
    }


    Direction getLeftDirection() {
        return new East();
    }

    Direction getRightDirection() {
        return new West();
    }
}
