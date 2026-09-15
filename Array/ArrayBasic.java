import java.util.*;
public class ArrayBasic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //creating an array
        int a[] = {1,2,3};
        for (int i = 0; i<3; i++){
            System.out.println(a[i]);
        }

        //finding the length of array
        int len = a.length;
        System.out.println("Length of array = " + len);

        //creating an array
        int[] b = new int[9];

        //entering the elements in array manually
        int sum = 0;
        System.out.println("Enter the elements of array");
        for(int i = 0; i<b.length; i++){
            b[i] = sc.nextInt();
            sum = b[i] + sum;
        }
        System.out.println(sum);
    }
}
