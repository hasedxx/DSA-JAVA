import java.util.*;
public class Add1ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the arraylist");
        int n = sc.nextInt();
        ArrayList <Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the list");
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            arr.add(a);
        }
        int carry = 1;
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i = n-1; i>= n-1; i--){
            if(arr.get(i) + carry <= 9){
                ans.add(arr.get(i) + carry);
                carry = 0;
            }
            else{
                ans.add(1);
                carry = 1;
            }
        if(carry == 1){
                ans.add(1);

        }
        Collections.reverse(ans);
        }

        System.out.println(ans);
    }
}

