import java.util.*;

public class point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter the value of x = ");
        x = sc.nextInt();
        System.out.println("Enter the value of y = ");
        y = sc.nextInt();

        if(x == 0 && y == 0)
            System.out.println("The point lies on the origin");
        else if(x != 0 && y == 0)
            System.out.println("The point lies on the x-axis");
        else if(x == 0 && y != 0)
            System.out.println("The point lies on the y-axis");
        else if(x > 0 && y > 0)
            System.out.println("The point lies on the 1-Quadrant");
        else if(x < 0 && y > 0)
            System.out.println("The point lies on the 2-Quadrant");
        else if(x < 0 && y < 0)
            System.out.println("The point lies on the 3-Quadrant");
        else if(x > 0 && y < 0)
            System.out.println("The point lies on the 4-Quadrant");
    }
}
