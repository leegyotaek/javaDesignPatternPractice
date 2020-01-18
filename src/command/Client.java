package command;

public class Client {
    public static void main(String[] args){

        Alarm alarm = new Alarm();
        Lamp lamp = new Lamp();

        Command lampOnCommand = new LampOnCommand(lamp);
        Command lampOffCommand = new LampOffCommand(lamp);
        Command alarmCommand = new AlarmStartCommand(alarm);

        Button button1 = new Button(lampOnCommand);
        button1.pressed();
        button1.pressed();

        button1.setCommand(lampOffCommand);
        button1.pressed();
        button1.pressed();


        Button button2 = new Button(alarmCommand);
        button2.pressed();

        button2.setCommand(lampOffCommand);
        button2.pressed();
    }
}
