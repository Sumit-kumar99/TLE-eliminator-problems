import java.util.*;
public class YarikAndArray {
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
        int odd = 0;
        int even = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                odd++;
                cnt += arr[i];
            }
            if(arr[i]%2==0){
                odd--;
                cnt += arr[i];
            }
            if(cnt<0 || odd<0 || odd>1){
                cnt = 0;
                odd = 0;
            }
            max = Math.max(max, cnt);
            
        }

        System.out.println(max);
    }
}