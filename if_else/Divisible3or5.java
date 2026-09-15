import java.util.*;
public class Divisible3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num = sc.nextInt();

        if(num%3==0 || num%5==0)
            System.out.println("Divisible");
        else
            System.out.println("not");
    }
}
