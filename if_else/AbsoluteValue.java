import java.util.*;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the num");
        num = sc.nextInt();

        if(num>=0){
            System.out.println(num);
        }
        else{
            System.out.println(num*(-1));
        }
    }
}
