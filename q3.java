import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    public static void solve(Scanner sc) {
        // Your code here
        int a = ((625 ^ 676) + (676 ^ 676) + (676 ^ 625) + (676 ^ 625) + (676 ^ 625) + (676 ^ 625));
        System.out.println(a);

    }
    
}