package homework._2024_05_14.basic.NumberPrinter;


import lombok.Setter;

@Setter
public class NumberPrinterThread2 extends Thread {
    private NumberPrinter printer;
    private int num;
    public NumberPrinterThread2(NumberPrinter printer, int num) {
        this.printer = printer;
        this.num = num;
    }
    @Override
    public void run() {
       printer.numPrint2(this.num);
    }
}
