import java.util.*;

public class Que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    // public static void solve(Scanner sc) {
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for(int i=0;i<n;i++) arr[i] = sc.nextInt();
    //     int zero=0, one=0;
    //     if(arr[0]==0) zero++;
    //     else one++;
    //     for(int i=1;i<n;i++){
    //         if(arr[i]==1) one++;
    //         else zero++;
    //         if(arr[i]==arr[i-1] && arr[i]==0){
    //             System.out.println("YES");
    //             return;
    //         }
    //     }
    //     if(one==n || zero==n){
    //         System.out.println("YES");
    //         return;
    //     }
    //     System.out.println("NO");
    //     return;
    // }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = Integer.MAX_VALUE; 
        int res1 = helper(a, m);
        int res2 = helper(n - a + 1, m);
        int res3 = helper(n, b);
        int res4 = helper(n, m - b + 1);
        ans = Math.min(Math.min(res1, res2), Math.min(res3, res4));
        System.out.println(1 + ans);
    }
    private static int helper(int x, int y) {
        int cnt = 0;
        while (x > 1) {
            cnt++;
            x = (x+1)/2;
        }
        while (y > 1) {
            cnt++;
            y = (y+1)/2;
        }
        return cnt;
    }

}
