import java.util.*;

public class TwoSum {
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

        int target = 7;

        Arrays.sort(arr);

        int i = 0 , j = arr.length-1;
        while(i<j){
            if(arr[i] + arr[j] == target){
                System.out.println("Present");
                break;
            }
            else if(arr[i] + arr[j] < target){
                i++;
            }
            else if(arr[i] + arr[j] > target) j--;
        }
    }
}
