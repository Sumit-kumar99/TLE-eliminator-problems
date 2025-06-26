import java.util.*;
public class Matryoshkas {
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
        
        Map<Long, Integer> m = new HashMap<>();
        TreeSet<Long> set = new TreeSet<>();

        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
            m.put(arr[i], m.getOrDefault(arr[i], 0)+1);
            set.add(arr[i]);
            set.add(arr[i]+1);// add next value to check new doll set started or not.  
        }
        int ans = 0;
        int temp = 0;
        for(Long i : set){
            int var = (m.containsKey(i))?m.get(i):0;
            ans += Math.max(0, var - temp);
            temp = var; 
        }

        System.out.println(ans);
    }
}