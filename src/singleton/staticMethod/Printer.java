package singleton.staticMethod;

public class Printer {

    private static int counter = 0;
    private Printer(){}

    public synchronized static void print(String str){
        counter++;
        System.out.println(str+ ", counter : "  + counter);

    }

    /*
    * 정적클래스를 사용할 경우 인터페이스 사용이 불가.
    * */


}
