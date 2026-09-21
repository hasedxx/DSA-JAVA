
import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(i==n-1) break;
            if(arr[i]<arr[i+1]){
                i++;
            }
            else{
                int a = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = a;
                i++;
            }
        }
        print(arr);

    }
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
