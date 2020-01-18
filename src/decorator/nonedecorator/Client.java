package decorator.nonedecorator;

public class Client {
    public static void main(String[] args){
        RoadDisplay roadDisplay = new RoadDisplay();
        roadDisplay.draw();

        RoadDisplay roadDisplayWithLane = new RoadDisplayWithLane();
        roadDisplayWithLane.draw();
    }
}
