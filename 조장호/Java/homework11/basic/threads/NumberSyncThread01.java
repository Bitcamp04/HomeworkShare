package homework11.basic.threads;

public class NumberSyncThread01 extends Thread{
	private NumberPrinter numberPrinter;

	public NumberPrinter getNumberPrinter() {
		return numberPrinter;
	}

	public void setNumberPrinter(NumberPrinter numberPrinter) {
		this.numberPrinter = numberPrinter;
	}
	
	@Override
	public void run() {
		numberPrinter.numPrint1(10);
	}
}
