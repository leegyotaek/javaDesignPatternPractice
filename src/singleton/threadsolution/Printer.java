package singleton.threadsolution;

public class Printer {

    private static Printer printer = new Printer();
    private int counter = 0;
    private Printer(){}

    public static Printer getPrinter() {
        return printer;
    }

    public void Print(String resource){
        counter++;
        System.out.println(resource+ ", counter : "  + counter);

    }

}
