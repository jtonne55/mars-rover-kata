package rover;

public class West extends Direction {
    public West(){
        super();
        directionTag = DirectionTag.W;
    }

    int getForwardTranslationX() {
        return -1;
    }

    int getForwardTranslationY() {
        return 0;
    }

    Direction getLeftDirection() {
        return new South();
    }

    Direction getRightDirection() {
        return new North();
    }
}
