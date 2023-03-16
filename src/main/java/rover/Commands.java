package rover;

import java.util.ArrayList;

public class Commands {

    ArrayList<Command> command_list;
    public Commands(char [] commands){

        this.command_list = new ArrayList<Command>();

        for(char command : commands){

            Command new_command = null;

            if(command == 'f'){
                new_command = new MoveForward();
            } else if (command == 'b') {
                new_command = new MoveBackward();
            } else if (command == 'l') {
                new_command = new TurnLeft();
            } else if (command == 'r') {
                new_command = new TurnRight();
            }

            if(new_command != null){
                this.command_list.add(new_command);
            }
        }
    }
}
