import java.util.*;
public class q2 {
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
            int[] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            // long mini = Long.MAX_VALUE;
            // int x = 0;
            // while (Math.pow(2, x)<=maxi) {
            //     x++;
            // }
            // int a = (int) Math.pow(2, x);
            // int b = (int) Math.pow(2, x)/2;
            
            // for(int i=0;i<n;i++){
            //     if(arr[i]>=b && arr[i]<a){
            //         maxi = Math.max(arr[i], maxi);
            //         mini = Math.min(arr[i], mini);
            //     }
            // }

            int temp = 30;
            int[] brr = new int[temp];
            for (int num : arr) {
                for (int j = 0; j < temp; j++) {
                    int val = (int) Math.pow(2, j);
                    if ((num & val) != 0) brr[j]++;
                }
            }
            long maxi = 0;
            for (int i = 0; i < n; i++) {
                long currsum = 0;
                for(int j = 0; j < temp; j++){
                    long val = (long) Math.pow(2, j);
                    if ((arr[i] & val) != 0) currsum += (long)(n - brr[j]) * val;
                    else currsum += (long)brr[j] * val;
                }
                maxi = Math.max(maxi, currsum);
            }
             // long brr = 0;
            // for(int i=0;i<n;i++){
            //     brr+=(arr[i]^maxi);
            // }
            // long brr1 = 0;
            // for(int i=0;i<n;i++){
            //     brr1+=(arr[i]^mini);
            // }
            System.out.println(maxi);

    }
}