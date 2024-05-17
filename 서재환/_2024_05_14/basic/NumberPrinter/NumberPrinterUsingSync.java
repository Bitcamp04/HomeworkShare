package homework._2024_05_14.basic.NumberPrinter;


public class NumberPrinterUsingSync {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public synchronized void numPrint1(int num) {
        this.setNum(num);
        for (int i = num; i <=50 ; i++) {
            if(i%3==0){
                System.out.println(i+ "num print 1");
            }
        }

    }

    public  synchronized void numPrint2(int num) {
        this.setNum(num);
        for (int i = num; i <=100 ; i++) {
            if(i%5==0 && i%7==0){
                System.out.println(i+ "num print 2");
            }
        }
    }
}
