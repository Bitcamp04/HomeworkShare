
package homework._2024_05_14.basic.NumberPrinter;


import lombok.Setter;

@Setter
public class NumberPrinterThreadUsingSync2 extends Thread {
    private NumberPrinterUsingSync printer;
    private int num;
    public NumberPrinterThreadUsingSync2(NumberPrinterUsingSync printer, int num) {
        this.printer = printer;
        this.num = num;
    }
    @Override
    public void run() {
       printer.numPrint2(this.num);
    }
}
