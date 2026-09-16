import java.util.*;

public class SwallowAndDeepCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4};
        int[] x = arr;

        x[2] = 89; //Swallow copy
        System.out.println(arr[2]);

        int[] y = Arrays.copyOf(arr, arr.length);
        y[2] = 5;
        System.out.println(y[2]);
        System.out.println(arr[2]);

    }
}
