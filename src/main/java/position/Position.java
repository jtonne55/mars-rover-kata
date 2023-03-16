package position;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public boolean equals(int x, int y){
        return (this.x == x && this.y == y);
    }

    public boolean equals(Position position){
        return (this.x == position.x && this.y == position.y);
    }
}
