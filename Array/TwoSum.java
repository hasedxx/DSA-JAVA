import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the size");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements = ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int Target;
        System.out.println("Enter the target value");
        Target = sc.nextInt();

        for(int i = 0; i<n; i++){
            for(int j = 1+i;j<n; j++){
                if((arr[i]+arr[j]) == Target){
                    System.out.println("Index of a = " +i);
                    System.out.println("Index of b = " +j);
                }
            }
        }
    }
}
