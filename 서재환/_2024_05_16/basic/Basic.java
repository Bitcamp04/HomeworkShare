package homework._2024_05_16.basic;

public class Basic {
    public static void main(String[] args) {
        int[] ints=new int[10];
        for(int i=0;i<ints.length;i++){
            ints[i]=i;
        }

        print(ints,x->{
            for(int i=0;i<x.length;i++){
                if((i % 2) == 0){
                    System.out.println(i);
                }
            }
        });
    }
    public static void print(int[] ints,PrintNumber printNumber){
        printNumber.printEnvenNum(ints);
    }
}
