import java.util.*;
public class Differentialsorting {
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
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        if(arr[n-2]>arr[n-1]){
            System.out.println(-1);
            return;
        }
        if(arr[n-1]<0){
            boolean flag = false; 
            for(int i=1;i<n;i++){
                if(arr[i]<arr[i-1]){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println(-1);
                return;
            }
            System.out.println(0);
            return;
        }
        else{
            System.out.println(n-2);
            for(int i=1;i<=n-2;i++){
                System.out.println(i+" "+(n-1)+" "+n);
            }
        }
    }
}