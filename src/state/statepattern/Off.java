package state.statepattern;


public class Off implements State {

    private static Off off = new Off();

    public static Off getInstance(){
        return off;
    }

    @Override
    public void turnOff(Light light) {
        System.out.println("변화 없음");

    }

    @Override
    public void turnOn(Light light) {
        System.out.println("Light ON");
        light.setState(On.getInstance());
    }
}
