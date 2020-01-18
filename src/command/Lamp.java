package command;

import state.statepattern.Light;
import state.statepattern.Off;
import state.statepattern.State;

public class Lamp extends Light {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public Lamp(){
        setState(Off.getInstance());
    }

    public void turnOn(){
        state.turnOn(this);
        //System.out.println("Turn lamp on");
    }

    public void turnOff() {
        state.turnOff(this);
        //System.out.println("Turn lamp off");
    }
}
