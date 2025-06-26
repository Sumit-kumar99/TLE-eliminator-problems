import java.util.*;
public class LunaticNeverContent {
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
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int res = arr[0]-arr[n-1];
        for(int i=0;i<n/2;i++){
            res = gcd(res, Math.abs(arr[i]-arr[n-1-i]));
            if(res == 1){
                System.out.println(1);
                return;
            }
        }
        System.out.println(res);
    }

    static int gcd(int a, int b){
        while (b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}