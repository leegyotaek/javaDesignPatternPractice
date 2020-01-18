package singleton.withinterface;

public class RealPrinter315 implements Printer {

    private static Printer printer = null;
    private RealPrinter315(){}

    public synchronized static Printer getInstance() {

        if(printer==null){
            try {
                Thread.sleep(1);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            printer = new RealPrinter315();
        }

        return printer;
    }

    @Override
    public void print(String str) {
        synchronized (this){
            System.out.println(str);
        }
    }
}
