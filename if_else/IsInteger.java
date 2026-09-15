import java.util.*;
public class IsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Enter the num = ");
        num = sc.nextDouble();
        int x = (int)num;
        if(num-x == 0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
