package template.basic;

import template.Direction;
import template.MotorStatus;

public class LGMotor {
    private MotorStatus motorStatus;
    private Door door;

    public LGMotor(Door door) {
        this.door = door;
        this.motorStatus = MotorStatus.STOPPED;
    }

    public void move(Direction direction){

        if (getMotorStatus()==MotorStatus.MOVING)
            return;

        if (door.getDoorStatus() == DoorStatus.OPENED)
            door.close();

        moveLgMotor(direction);
    }

    private void moveLgMotor(Direction direction) {
        System.out.println("LG Motor");

    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }
}
