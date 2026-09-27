
import java.util.Scanner;

public class SelectionSort {
    public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,9,6,4,2,5,-4,0,5,2};
        print(arr);

        
        for(int i = 0; i<arr.length-1; i++){
            int min = i;
            for(int j = i + 1; j<arr.length; j++){
                if(arr[j]< arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        print(arr);
    }
}
