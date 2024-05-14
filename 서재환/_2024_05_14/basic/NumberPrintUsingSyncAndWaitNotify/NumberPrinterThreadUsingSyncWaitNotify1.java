package homework._2024_05_14.basic.NumberPrintUsingSyncAndWaitNotify;


import lombok.Setter;

@Setter
public class NumberPrinterThreadUsingSyncWaitNotify1 extends Thread {
    private NumberPrinterUsingSyncWaitNotify printer;
    private int num;
    public NumberPrinterThreadUsingSyncWaitNotify1(NumberPrinterUsingSyncWaitNotify printer, int num) {
        this.printer = printer;
        this.num = num;
    }
    @Override
    public void run() {
       printer.numPrint1(this.num);
    }
}
