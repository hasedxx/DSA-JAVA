import java.util.*;
public class Mul2OddAdd10Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements = ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(i%2 == 0)
                arr[i] = arr[i] + 10;
            else
                arr[i] = arr[i] * 10;
        }
        print(arr);
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
