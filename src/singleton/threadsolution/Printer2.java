package singleton.threadsolution;


public class Printer2 {

    private static Printer2 printer = null;
    private int counter = 0;

    private Printer2(){}

    public synchronized static Printer2 getInstance() {

        if(printer==null){
            try {
                Thread.sleep(1);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            printer = new Printer2();
        }

        return printer;
    }

    public void Print(String resource){
        synchronized (this){
            counter++;
            System.out.println(resource+counter);
        }

    }

}
