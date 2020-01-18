package singleton.basic;

import singleton.basic.Printer;

public class User {

    String name;

    public User(String name) {
        this.name = name;
    }

    public void print(){
        Printer printer = Printer.getInstance();
        printer.Print(this.name + "print using" + printer.toString() + ".");
    }


}
