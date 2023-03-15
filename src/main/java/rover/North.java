package rover;

public class North extends Direction{
    public North(){
        super();
        directionTag = DirectionTag.N;
    }


    int getForwardTranslationX() {
        return 0;
    }

    int getForwardTranslationY() {
        return 1;
    }


    Direction getLeftDirection() {
        return new West();
    }

    @Override
    Direction getRightDirection() {
        return new East();
    }
}
