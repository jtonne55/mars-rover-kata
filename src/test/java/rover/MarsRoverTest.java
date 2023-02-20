package rover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import rover.Direction;
import rover.MarsRover;


public class MarsRoverTest {

    @Test
    public void initialPositionXTest(){
        int expected_x = 42;

        int actual_x = (new MarsRover(42,(int)(Math.random()))).getX();

        Assertions.assertEquals(expected_x, actual_x);
    }

    @Test
    public void initialPositionYTest(){
        int expected_y = 42;

        int actual_y = (new MarsRover((int)(Math.random()), 42)).getY();

        Assertions.assertEquals(expected_y, actual_y);
    }

    @Test
    public void directionTest(){
        Direction expected = Direction.N;

        Direction actual = new MarsRover(Direction.N).getDirection();

        Assertions.assertEquals(expected, actual);
    }

}
