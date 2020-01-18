package singleton.threadsolution;

public class User extends Thread {

    public User(String name) {
        super(name);
    }

    public void run(){
        Printer printer = Printer.getPrinter();
        printer.Print(Thread.currentThread().getName() + "print using" + printer.toString() + ".");

        Printer2 printer2  = Printer2.getInstance();
        printer2.Print(Thread.currentThread().getName() + "print2 using" + printer2.toString() + ".");
    }


}