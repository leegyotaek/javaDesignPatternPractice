package command;

public class LampOffCommand implements Command {

    Lamp theLamp;

    public LampOffCommand(Lamp theLamp){
        this.theLamp = theLamp;
    }

    @Override
    public void excute() {
        theLamp.turnOff();
    }
}
