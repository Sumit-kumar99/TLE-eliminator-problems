import java.util.*;
public class CountingOrders {
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
        ArrayList<Long> a = new ArrayList<>();
        ArrayList<Long> b = new ArrayList<>();

        for(int i=0;i<n;i++){
            a.add(sc.nextLong());
        }
        for(int i=0;i<n;i++){
            b.add(sc.nextLong());
        }
        Collections.sort(a, (x, y) -> Long.compare(y, x));
        // System.out.println(a);
        Collections.sort(b);
        int j = 0;
        long cnt = 1;
        int mod = 1000000007;
        int temp = 0;
        for(int i=n-1;i>=0;i--){
            while(j<n && b.get(j)<a.get(i)){
                j++;
            }
            cnt = (cnt*(j-temp))%mod;
            // System.out.print(cnt+" ");
            temp++;
        }
        // System.out.println();

        System.out.println(cnt);
    }
}