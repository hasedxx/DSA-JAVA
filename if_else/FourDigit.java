import java.util.*;

public class FourDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number = ");
        num = sc.nextInt();

        if(num>999 && num<10000)
            System.out.println("It is");
        else
            System.out.println("It is not"); 
    }
}
