import java.util.*;
public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
 
    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long k = sc.nextLong();
        long[] a = new long[(int) n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        
        long b = 1;
        if (n == k) {
            for (int i = 1; i < n; i += 2) {
                if (a[i] != b) {
                    System.out.println(b);
                    return;
                }
                b++;
            }
            System.out.println(b);
            return;
        }
        
        for (int i = 1; i <= n - k + 1; i++) {
            if (a[i] != 1) {
                System.out.println(1);
                return;
            }
        }
        
        System.out.println(2);
        }
}