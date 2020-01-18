package template.template;

import template.Direction;
import template.MotorStatus;
import template.basic.Door;
import template.basic.DoorStatus;

public class HyundaiMotor extends Motor {

    public HyundaiMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("Hyundai Motor");
    }


}
