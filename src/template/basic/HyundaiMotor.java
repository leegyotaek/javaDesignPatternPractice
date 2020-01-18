package template.basic;

import template.Direction;
import template.MotorStatus;

public class HyundaiMotor {
    private MotorStatus motorStatus;
    private Door door;

    public HyundaiMotor(Door door) {
        this.door = door;
        this.motorStatus = MotorStatus.STOPPED;
    }

    public void move(Direction direction){

        if (getMotorStatus()==MotorStatus.MOVING)
            return;

        if (door.getDoorStatus() == DoorStatus.OPENED)
            door.close();

        moveHyundaiMotor(direction);
    }

    private void moveHyundaiMotor(Direction direction) {
        System.out.println("hyundai Motor");

    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }
}
