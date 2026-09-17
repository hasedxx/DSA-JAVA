import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Reverse(arr);
    }

    public static void Reverse(int[] a){
        for (int i = 0; i < (a.length)/2; i++) {
            int b = a[i];
            a[i] = a[(a.length)-(i+1)];
            a[(a.length)-(i+1)] = b;
        }
        print(a);
    }

    public static void print(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
