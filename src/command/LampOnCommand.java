package command;

public class LampOnCommand implements Command {

    Lamp theLamp;

    public LampOnCommand(Lamp theLamp){
        this.theLamp = theLamp;
    }

    @Override
    public void excute() {
        theLamp.turnOn();
    }
}
