import java.util.*;

public class SideOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1, s2, s3;
        System.out.println("Enter the sides = ");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();

        if((s1+s2)>s3 && (s2+s3)>s1 && (s1+s3)>s2 )
            System.out.println("They can be");
        else
            System.out.println("no");
    }
}
