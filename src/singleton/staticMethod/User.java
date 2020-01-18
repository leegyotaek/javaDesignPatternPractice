package singleton.staticMethod;


public class User extends Thread {

    public User(String name) {
        super(name);
    }

    public void run(){
        Printer.print(Thread.currentThread().getName() + "print using" + ".");
    }


}