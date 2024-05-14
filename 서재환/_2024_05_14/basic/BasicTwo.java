package homework._2024_05_14.basic;

public class BasicTwo {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run(){
                for(int i = 1; i <= 20; i++) {
                    if(30%i==0 && i!=1) System.out.println(i+" 약수 출력");
                }
            }
        };
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        for(int i = 1; i <= 20; i++) {
            if(i%3==0 && i % 4==0) System.out.println(i+" 공배수 출력");
        }



    }
}
