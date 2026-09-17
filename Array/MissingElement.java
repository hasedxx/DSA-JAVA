import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int an = n+1;
        int sum = an*(an+1)/2;
        int arrsum = 0;
        for(int ele : arr){
            arrsum = arrsum + ele;
        }

        int elem = sum - arrsum;
        System.out.println(elem);

    }
}
