package rover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import rover.Direction;
import rover.MarsRover;


public class MarsRoverTest {

    @Test
    public void initial_position_x_equals_40_should_return_40_Test(){
        int expected_x = 40;

        int actual_x = (new MarsRover(40,0)).getX();

        Assertions.assertEquals(expected_x, actual_x);
    }

    @Test
    public void initial_position_y_equals_40_should_return_y_equals_40_Test(){
        int expected_y = 40;

        int actual_y = (new MarsRover(0, 40)).getY();

        Assertions.assertEquals(expected_y, actual_y);
    }

    @Test
    public void create_mars_rover_with_north_direction_should_return_north_mars_rover_direction_Test(){
        DirectionTag expected = DirectionTag.N;

        DirectionTag actual = new MarsRover(DirectionTag.N).getDirection().getDirectionTag();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void move_forward_north_direction_y_position_0_should_return_y_equals_1_Test(){
        int expected_y = 1;

        MarsRover bot = new MarsRover(0,0, DirectionTag.N);

        bot.moveForward();

        int actual_y = bot.getY();

        Assertions.assertEquals(expected_y, actual_y);
    }

    @Test
    public void move_forward_north_direction_x_equals_0_should_return_x_equals_0_Test(){
        int expected_x = 0;

        MarsRover bot = new MarsRover(0,0, DirectionTag.N);

        bot.moveForward();

        int actual_x = bot.getX();

        Assertions.assertEquals(expected_x, actual_x);
    }

    @Test
    public void move_forward_south_direction_y_equals_1_should_return_0_Test(){
        int expected_y = 0;

        MarsRover bot = new MarsRover(0,1, DirectionTag.S);

        bot.moveForward();

        int actual_y = bot.getY();

        Assertions.assertEquals(expected_y, actual_y);
    }

    @Test
    public void move_backward_east_direction_x_position_1_should_return_x_equals_0_Test(){
        int expected_x = 0;

        MarsRover bot = new MarsRover(1,0, DirectionTag.E);

        bot.moveBackward();

        int actual_x = bot.getX();

        Assertions.assertEquals(expected_x, actual_x);
    }

    @Test
    public void move_backward_west_direction_x_position_3_should_return_x_equals_4_Test(){
        int expected_x = 4;

        MarsRover bot = new MarsRover(3,0, DirectionTag.W);

        bot.moveBackward();

        int actual_x = bot.getX();

        Assertions.assertEquals(expected_x, actual_x);
    }

    @Test
    public void turn_left_from_north_should_return_west_direction_Test(){
        DirectionTag expected = DirectionTag.W;

        MarsRover bot =  new MarsRover(DirectionTag.N);

        bot.turnLeft();

        DirectionTag actual = bot.getDirection().getDirectionTag();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turn_right_from_east_should_return_south_direction_Test(){
        DirectionTag expected = DirectionTag.S;

        MarsRover bot =  new MarsRover(DirectionTag.E);

        bot.turnRight();

        DirectionTag actual = bot.getDirection().getDirectionTag();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void move_forward_to_east_from_last_x_position_should_return_0_Test(){
        int expected = 0;

        MarsRover bot =  new MarsRover(41,0, DirectionTag.E);

        bot.moveForward();

        int actual = bot.getX();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next_step_move_forward_east_from_x_0_y_0_position_should_report_obstacle_true_Test(){
        boolean expected = true;

        MarsRover bot =  new MarsRover(DirectionTag.E);

        bot.addObstacle(new Position(1,0));

        boolean actual = bot.ifMoveForwardIsAnObstacle();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next_step_move_forward_east_from_x_0_y_0_position_should_report_obstacle_false_Test(){
        boolean expected = false;

        MarsRover bot =  new MarsRover(DirectionTag.E);

        bot.addObstacle(new Position(0,0));

        boolean actual = bot.ifMoveForwardIsAnObstacle();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next_step_move_backward_east_from_x_1_y_0_position_should_report_obstacle_true_Test(){
        boolean expected = true;

        MarsRover bot =  new MarsRover(1, 0, DirectionTag.E);

        bot.addObstacle(new Position(0,0));

        boolean actual = bot.ifMoveBackwardIsAnObstacle();

        Assertions.assertEquals(expected, actual);
    }

  

}
