package state.basic;

public class Light {

    private final int OFF = 0;
    private final int ON = 1;

    private int state;

    public Light(){
        state = OFF;
    }

    public void turnOffLight(){
        if(state == OFF)
            System.out.println("아무 변화 없음");
        else if(state == ON)
            state = OFF;
    }

    public void trunOnLight(){
        if(state == ON)
            System.out.println("아무 변화 없음");
        else if(state == OFF)
            state = ON;
    }
}
