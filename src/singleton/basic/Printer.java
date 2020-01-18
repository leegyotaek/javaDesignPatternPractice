package singleton.basic;

public class Printer {

    private static Printer printer = null;
    private Printer(){}

    public static Printer getInstance(){
        if(printer==null){
            printer = new Printer();
        }

        return printer;
    }

    public void Print(String resource){
        System.out.println(resource);
    }

}
