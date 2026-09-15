
import java.util.*;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num = sc.nextInt();

        if(num%5 == 0)
            System.out.println("Divisible");
        else
            System.out.println("Not");
    }
}
