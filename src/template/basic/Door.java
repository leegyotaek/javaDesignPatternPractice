package template.basic;

public class Door {
    private DoorStatus doorStatus;

    public Door() {
        doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus getDoorStatus(){
        return doorStatus;
    }

    public void open() {
        doorStatus = DoorStatus.OPENED;
    }

    public void close() {
        doorStatus = DoorStatus.CLOSED;
    }
}
