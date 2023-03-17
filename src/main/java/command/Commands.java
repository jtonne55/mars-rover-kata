package command;

import exception.CommandNotFoundException;

import java.util.ArrayList;

public class Commands {

    public ArrayList<Command> command_list;
    public Commands(char [] commands){

        this.command_list = new ArrayList<Command>();

        for(char command : commands){

            Command new_command = null;

            try {
                new_command = getCommandFromLetter(command);

                if(new_command != null){
                    this.command_list.add(new_command);
                }
            }
            catch (CommandNotFoundException notFoundException) {
            }
        }
    }

    public Command getCommandFromLetter(char commandLetter) throws CommandNotFoundException {

        switch(commandLetter) {

            case 'f' : return new MoveForward();
            case 'b' : return new MoveBackward();
            case 'l' : return new TurnLeft();
            case 'r' : return new TurnRight();

            default : throw new CommandNotFoundException();
        }
    }
}
