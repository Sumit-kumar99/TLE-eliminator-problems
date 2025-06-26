import java.util.*;
public class Dolcev {
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
        int x = sc.nextInt();
        long[] arr = new long[n];
        long sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            sum += arr[i];
            arr[i] = sum;
        }

        long cnt = 0;

        for(int i=0;i<n;i++){
            if(arr[i]>x) break;
            long temp = ((x - arr[i])/(i+1))+1;
            cnt+=temp;
        }
        System.out.println(cnt);

        // use C++ 
        // this code is giving TLE for some Test cases. :(
    }
}