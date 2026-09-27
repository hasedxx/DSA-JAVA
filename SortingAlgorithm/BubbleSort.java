
import java.util.Scanner;


public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);
        int swap = 0;
        for (int i = 0; i < n-1; i++) {
            for(int j = 0; j<n-1-i; j++){
            if(arr[j]> arr[j+1]){
                int b = arr[j];
                arr[i] = arr[j+1];
                arr[j+1] = b;
                swap++; 
            }
            if(swap == 0) break;
        }
        }
        print(arr);
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
    }
}
