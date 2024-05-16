package homework._2024_05_16.middle;

import java.util.Arrays;
import java.util.Optional;

public class IntArrUtils {
    public static int getMax(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }
    public static int getMin(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }
    public static int getMid(int[] arr) {
        return Arrays.stream(arr).sorted().toArray()[arr.length/2];
    }
}
