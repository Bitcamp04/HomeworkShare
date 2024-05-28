package homework._2024_05_14.basic.NumberPrinter;


import lombok.Setter;

@Setter
public class NumberPrinterThreadUsingSync1 extends Thread {
    private NumberPrinterUsingSync printer;
    private int num;
    public NumberPrinterThreadUsingSync1(NumberPrinterUsingSync printer, int num) {
        this.printer = printer;
        this.num = num;
    }
    @Override
    public void run() {
       printer.numPrint1(this.num);
    }
}
