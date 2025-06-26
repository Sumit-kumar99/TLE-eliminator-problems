import java.util.*;
public class D1857 {
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
        long[] brr = new long[n];

        long maxi = Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        for(int i=0;i<n;i++){
            brr[i] = sc.nextLong();
        }
        for(int i=0;i<n;i++){
            arr[i] = arr[i] - brr[i];
            maxi = Math.max(arr[i], maxi);
        }
        // System.out.println(maxi);
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==maxi){
                list.add(i+1);
                cnt++;
            }
        }
        System.out.println(cnt);
        for(int i: list){
            System.out.print(i+" ");
        }
        System.out.println();
       

        

    }
}