import java.util.*;
public class Numbers3Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter the 3 numbers = ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3)
            System.out.println("Number 1 is greatest");
        else if(num2 >= num1 && num2 >= num3)
            System.out.println("Number 2 is greatest");
        else if(num3 >= num2 && num3 >= num1)
            System.out.println("Number 3 is greatest");
    }
}
