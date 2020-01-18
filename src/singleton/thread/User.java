package singleton.thread;

public class User extends Thread {

    public User(String name) {
        super(name);
    }

    public void run(){
        Printer printer = Printer.getInstance();
        printer.Print(Thread.currentThread().getName() + "print using" + printer.toString() + ".");
    }


}