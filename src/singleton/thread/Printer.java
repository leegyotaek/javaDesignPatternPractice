package singleton.thread;

public class Printer {

    private static Printer printer = null;
    private int counter = 0;
    private Printer(){}

    public static Printer getInstance() {

        if(printer==null){
            try {
                Thread.sleep(1);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            printer = new Printer();
        }

        return printer;
    }

    public void Print(String resource){
        counter++;
        System.out.println(resource+counter);

    }

}
