package homework._2024_05_14.basic.NumberPrinter;


import lombok.Setter;

@Setter
public class NumberPrinterThread1 extends Thread {
    private NumberPrinter printer;
    private int num;
    public NumberPrinterThread1(NumberPrinter printer, int num) {
        this.printer = printer;
        this.num = num;
    }
    @Override
    public void run() {
       printer.numPrint1(this.num);
    }
}
