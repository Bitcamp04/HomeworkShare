package homework._2024_05_14.basic.NumberPrinter;

public class NumberPrinterMain {
    public static void main(String[] args) {

        NumberPrinter printer = new NumberPrinter();


        NumberPrinterThread1 numberPrinterThread1=new NumberPrinterThread1(printer,30);
        NumberPrinterThread2 numberPrinterThread2=new NumberPrinterThread2(printer,30);


        numberPrinterThread1.start();
        numberPrinterThread2.start();

        try {
            numberPrinterThread1.join();
            numberPrinterThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
