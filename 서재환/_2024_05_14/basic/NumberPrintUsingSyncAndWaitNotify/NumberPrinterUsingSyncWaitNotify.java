package homework._2024_05_14.basic.NumberPrintUsingSyncAndWaitNotify;


public class NumberPrinterUsingSyncWaitNotify {
    private int num;
    private boolean flag = true;
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
                notify();
                try {
                    if(flag)  wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }

        }
        notify();
        flag = false;
    }

    public  synchronized void numPrint2(int num) {
        this.setNum(num);
        for (int i = num; i <=100 ; i++) {
            if(i%5==0 && i%7==0){
                System.out.println(i+ "num print 2");
                notify();
                try {
                    if(flag)  wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }

        }
        notify();
        flag = false;
    }
}
