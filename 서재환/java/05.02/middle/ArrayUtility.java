package homework._2024_05_02.middle;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        double[] doubles={1.0,2.0,3.0};
        int[] ints={1,2,3};

        double[] transdoubles=intToDouble(ints);

        int[] transints=doubleToInt(doubles);


        for(int i=0;i<transints.length;i++)
            System.out.println(transints[i]);
        for (int i=0;i<transdoubles.length;i++)
            System.out.println(transdoubles[i]);
    }


    static double[] intToDouble(int[] source){
        return Arrays.stream(source).mapToDouble(i -> i).toArray();
    }	// int배열을 double배열로 변환
    static int[] doubleToInt(double[] source){
        return Arrays.stream(source).mapToInt(i->(int) i).toArray();
    }
}
