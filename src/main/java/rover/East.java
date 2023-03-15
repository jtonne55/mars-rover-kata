package rover;

public class East extends Direction{
    public East(){
        super();
        directionTag = DirectionTag.E;
    }


    int getForwardTranslationX() {
        return 1;
    }

    int getForwardTranslationY() {
        return 0;
    }

    Direction getLeftDirection() {
        return new North();
    }

    Direction getRightDirection() {
        return new South();
    }
}