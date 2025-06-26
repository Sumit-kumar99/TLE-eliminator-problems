import java.util.*;
public class MaximumSum {
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
        int k = sc.nextInt();
        int[] arr = new int[n];
        
        long sum = 0;
        long sum1 = 0;
        long[] hash = new long[n+1];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        long res = 0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            sum += arr[i];
            hash[i+1] = sum;
        }
        for(int i=0;i<=k;i++){
            long temp = hash[n-(k-i)]-hash[2*i];
            res = Math.max(res, temp);
        }
        System.out.println(res);
    }
}