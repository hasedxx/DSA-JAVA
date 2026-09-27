import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {3,9,6,4,2,5,-4,0,5,2};
        print(arr1);
        int[] arr2 = {9,4,2,6,0,4,-2,-4,2,5};
        print(arr2);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        System.out.println("Common elements are = ");
        while(i<arr1.length && j< arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]+ " ");
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]) i++;
            else if(arr1[i] > arr2[j]) j++;
        }
    }
}
