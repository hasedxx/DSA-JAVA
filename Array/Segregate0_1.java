import java.util.*;
public class Segregate0_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
            }

        }
        print(arr);
    }
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
