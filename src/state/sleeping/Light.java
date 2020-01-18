package state.sleeping;

public class Light {

    private final int OFF = 0;
    private final int ON = 1;
    private final int SLEEPING = 2;


    private int state;

    public Light(){
        state = OFF;
    }

    public void turnOffLight(){
        if(state == OFF)
            System.out.println("아무 변화 없음");
        else if(state == ON || state == SLEEPING)
            state = OFF;
    }

    public void trunOnLight(){
        if(state == ON)
            System.out.println("아무 변화 없음");
        else if(state == OFF || state == SLEEPING)
            state = ON;
    }
}
