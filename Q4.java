import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            if(Math.abs(arr[i] - arr[i + 1]) <= 1){
                System.out.println(0);
                return;
            }
        }
        for (int i = 0; i + 1 < n; i++) {
            int a = Math.min(arr[i], arr[i + 1]);
            int b = Math.max(arr[i], arr[i + 1]);
            if(i>0){
                int lside = arr[i - 1];
                int maxi = Math.max(a, lside - 1);
                int mini = Math.min(b, lside + 1);
                if (maxi <= mini) {
                    System.out.println(1);
                    return;
                }
            }
        }
        
        for (int i = 0; i + 1 < n; i++) {
            int a = Math.min(arr[i], arr[i + 1]);
            int b = Math.max(arr[i], arr[i + 1]);
            if(i+2<n){
                int rside = arr[i + 2];
                int maxi = Math.max(a, rside - 1);
                int mini = Math.min(b, rside + 1);
                if (maxi <= mini) {
                    System.out.println(1);
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}
