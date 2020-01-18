package singleton.withinterface;

public class UsePrinter {

    public void doSomething(Printer printer){
        String str = "this is a test";


        printer.print(str);
    }
}
