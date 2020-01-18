package template.template;

import template.Direction;
import template.basic.Door;

public class LgMotor extends Motor {

    public LgMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("LG Motor");
    }


}
