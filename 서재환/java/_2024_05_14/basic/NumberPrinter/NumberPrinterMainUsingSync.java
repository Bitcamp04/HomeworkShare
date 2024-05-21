package homework._2024_05_14.basic.NumberPrinter;

public class NumberPrinterMainUsingSync {
    public static void main(String[] args) {

        NumberPrinterUsingSync printer = new NumberPrinterUsingSync();


        NumberPrinterThreadUsingSync1 numberPrinterThread1=new NumberPrinterThreadUsingSync1(printer,30);
        NumberPrinterThreadUsingSync2 numberPrinterThread2=new NumberPrinterThreadUsingSync2(printer,30);


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
