import java.util.*;
public class E1915 {
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
            arr[i] = sc.nextLong();
            if(i%2==1){
                arr[i] = -arr[i];
            }
        }

        Map<Long, Integer> m = new HashMap<>();

        long sum = 0L;
        m.put(sum, m.getOrDefault(sum, 0)+1);
        for(long a : arr){
            sum += a;
            if(m.containsKey(sum)){
                System.out.println("YES");
                return;
            }
            m.put(sum, m.getOrDefault(sum, 0)+1);
        }
        

        System.out.println("NO");


    }
}