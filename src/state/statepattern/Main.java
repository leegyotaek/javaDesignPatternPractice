package state.statepattern;

public class Main {

    public static void main(String[] args){
        System.out.println("main()");

        Light light = new Light();

        light.turnOffLight();
        light.trunOnLight();
        light.trunOnLight();
        light.turnOffLight();
        light.turnOffLight();


    }
}
