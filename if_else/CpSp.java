import java.util.*;

public class CpSp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp,sp;
        System.out.println("Enter the cost price");
        cp = sc.nextInt();
        System.out.println("Enter the selling price");
        sp = sc.nextInt();

        if(cp>sp)
            System.out.println("Loss = " + (cp-sp));
        else if(cp < sp)
            System.out.println("Profit = " +(sp-cp));
        else
            System.out.println("NO PROFIT NO LOSS");
    }
}
