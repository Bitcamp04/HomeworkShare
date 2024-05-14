
package homework._2024_05_14.basic.NumberPrintUsingSyncAndWaitNotify;


import lombok.Setter;

@Setter
public class NumberPrinterThreadUsingSyncWaitNotify2 extends Thread {
    private NumberPrinterUsingSyncWaitNotify printer;
    private int num;
    public NumberPrinterThreadUsingSyncWaitNotify2(NumberPrinterUsingSyncWaitNotify printer, int num) {
        this.printer = printer;
        this.num = num;
    }
    @Override
    public void run() {
       printer.numPrint2(this.num);
    }
}
