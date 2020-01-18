package state.statepattern;

public class On implements State {

    private static On on = new On();

    public static On getInstance(){
        return on;
    }

    @Override
    public void turnOff(Light light) {
        System.out.println("Light OFF");
        light.setState(Off.getInstance());
    }

    @Override
    public void turnOn(Light light) {
        System.out.println("변화 없음");
    }
}
