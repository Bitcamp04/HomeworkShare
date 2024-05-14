package homework._2024_05_14.basic.NumberPrintUsingSyncAndWaitNotify;



public class NumberPrinterMainUsingSync {
    public static void main(String[] args) {

        NumberPrinterUsingSyncWaitNotify printer = new NumberPrinterUsingSyncWaitNotify();


        NumberPrinterThreadUsingSyncWaitNotify1 numberPrinterThread1=new NumberPrinterThreadUsingSyncWaitNotify1(printer,30);
        NumberPrinterThreadUsingSyncWaitNotify2 numberPrinterThread2=new NumberPrinterThreadUsingSyncWaitNotify2(printer,30);


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
