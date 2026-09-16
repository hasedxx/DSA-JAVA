import java.util.*;
public class SortArrayBuiltIn {
    public static void main(String[] args) {
        int[] arr = { 7,9,0,3,54,8};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] a) {
    for (int i = 0; i < a.length; i++) {
        System.out.print(a[i]+ " ");
    }
    System.out.println();
}

}

