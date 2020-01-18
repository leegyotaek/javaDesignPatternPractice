package singleton.withinterface;

import junit.framework.TestCase;

public class PrinterTest extends TestCase {
    public void testdoSomething(){
        FakePrinter fake = new FakePrinter();
        UsePrinter u = new UsePrinter();
        u.doSomething(fake);
        assertEquals("this is a test", fake.get());

    }
}
