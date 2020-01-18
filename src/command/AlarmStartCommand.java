package command;

public class AlarmStartCommand implements Command {

    Alarm theAlarm;

    public AlarmStartCommand(Alarm theAlarm){
        this.theAlarm = theAlarm;
    }

    @Override
    public void excute() {
        theAlarm.start();
    }
}
