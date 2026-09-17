import java.util.Scanner;

public class RotataArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the steps the array to be rotated");
        int d = sc.nextInt();
        d = d%n;
        rotate(arr,0,d-1);
        rotate(arr,d,n-1);
        rotate(arr,0,n-1);
        print(arr);

    }

    public static void rotate(int[] a, int x, int y) {
        for(int i = 0; i<((y-x+1)/2); i++){
            int b = a[x+i];
            a[x+i] = a[y-i];
            a[y-i] = b;
        } 
        
    }
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
