package decorator.nonedecorator;

import decorator.nonedecorator.RoadDisplay;

public class RoadDisplayWithLane extends RoadDisplay {

    @Override
    public void draw(){
        super.draw();
        drawLane();
    }

    private void drawLane() {
        System.out.println("draw lane additionally");
    }

}
