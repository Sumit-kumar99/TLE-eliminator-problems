import java.util.*;

public class BinaryDeque {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int i=0, j=0;
        while(j<n && i<n){
            if(sum<=m){
                sum += arr[j];
            }
            while(i<n && sum>m){
                sum -= arr[i];
                i++;
            }
            if(sum == m) max = Math.max(j-i+1, max);
            j++;
        }
        if(max == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(n-max);        
    }
}
