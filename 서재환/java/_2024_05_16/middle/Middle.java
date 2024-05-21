package homework._2024_05_16.middle;

import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb1= new StringBuilder(sc.nextLine());
        StringBuilder sb2= new StringBuilder(sc.nextLine());

        System.out.println(combineStrBuilder(sb1, sb2, (x, y) -> x.append(y).reverse()));


        int[] input=new int[100];
        for(int i=0;i<100;i++){
            input[i]=(int)(Math.random()*1000);
        }

        System.out.println(num3(input, IntArrUtils::getMax));

        System.out.println(num3(input, IntArrUtils::getMin));

        System.out.println(num3(input, IntArrUtils::getMid));

    }
    public static StringBuilder combineStrBuilder(StringBuilder str1, StringBuilder str2,StringBuilderUtils stringBuilderUtils){
        return stringBuilderUtils.combineStrBuilder(str1,str2);
    }
    public static int num3(int[] arr,MaxMinMid maxMinMid){
        return maxMinMid.maxOrMinOrMid(arr);
    }
}
