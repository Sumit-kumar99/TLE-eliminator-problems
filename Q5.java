import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    //  public static void solve(Scanner sc){
    //     // Your code here
    //         int a = sc.nextInt();
    //         int x = sc.nextInt();
    //         int y = sc.nextInt();

    //         if(x>y){
    //             if(a>=y && a<=x){
    //                 System.out.println("NO");
    //                 return;
    //             }
    //         }
    //         if(x<y){
    //             if(a<=y && a>=x){
    //                 System.out.println("NO");
    //                 return;
    //             }
    //         }
    //         System.out.println("YES");
    //         return;

            
    // }

    public static void solve(Scanner sc) {

         int n = sc.nextInt();
            int[] arr = new int[n];

            // Input array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int maxi1 = arr[n - 1];
            int maxi2 = arr[n - 2];

            long cnt = 0;

            for (int k = 2; k < n; k++) {
                long temp1 = 2L * arr[k];
                long temp2 = (k == n - 1) ? maxi2 : maxi1;
                long temp = Math.max(temp1, temp2);
                long X = temp - arr[k];

                int l = 0;
                int r = k - 1;
                while (l < r) {
                    long sum = (long) arr[l] + arr[r];
                    if (sum > X){
                        cnt += (r - l);
                        r--;
                    } 
                    else {
                        l++;
                    }
                }
            }

            System.out.println(cnt);

    }
}