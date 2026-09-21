
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter the size");
        n1 = sc.nextInt();
        System.out.println("Enter the size");
        n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        arr1  = insert(arr1, n1);
        arr2 = insert(arr2, n2);

        int x = n1+n2;
        int[] marr = new int[x];
        merge(arr1,arr2,marr);

        
    }


    public static int[] insert(int[] arr, int x){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the elements");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void merge(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                c[k++] = a[i++];
            }
            else{
                c[k++] = b[j++];
            }
        }
        while(i<a.length){
            c[k++] = a[i++];
        }
        while(j<b.length){
            c[k++] = b[j++];
        }
    }
}
