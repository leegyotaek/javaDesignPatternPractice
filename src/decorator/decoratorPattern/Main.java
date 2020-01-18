package decorator.decoratorPattern;

public class Main {
    public static void main(String[] args){

        Display display = new RoadDisplay();
        display.draw();

        Display display2 = new LaneDecorator(display);
        display2.draw();

        Display display3 = new TrafficDecorator(display);
        display3.draw();

    }
}
