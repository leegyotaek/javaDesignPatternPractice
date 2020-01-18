package template.template;

import template.Direction;
import template.MotorStatus;
import template.basic.Door;
import template.basic.DoorStatus;

public abstract class Motor {
    private MotorStatus motorStatus;
    private Door door;

    public Motor(Door door) {
        this.door = door;
        this.motorStatus = MotorStatus.STOPPED;
    }

    public void move(Direction direction){

        if (getMotorStatus()==MotorStatus.MOVING)
            return;

        if (door.getDoorStatus() == DoorStatus.OPENED)
            door.close();

        moveMotor(direction);
    }

    protected abstract void moveMotor(Direction direction);

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }
}
