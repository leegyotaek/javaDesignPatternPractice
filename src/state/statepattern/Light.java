package state.statepattern;

public class Light {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public Light(){
        setState(Off.getInstance());
    }

    public void turnOffLight(){
        state.turnOff(this);
    }

    public void trunOnLight(){
        state.turnOn(this);
    }
}
