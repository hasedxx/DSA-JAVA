import java.util.*;

public class ReverseIndexArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int st,fi;
        System.out.println("Enter the starting index");
        st = sc.nextInt();
        System.out.println("Enter the ending index");
        fi = sc.nextInt();

        for(int i = 0; i<((st+fi)/2)-1; i++){
            int b = arr[st+i];
            arr[st+i] = arr[fi-i];
            arr[fi-i] = b;
        }        
        print(arr);
        
    }
    public static void print(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
