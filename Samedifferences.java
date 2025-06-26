import java.util.*;
public class Samedifferences {
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
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        
        long ans = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
            int temp = arr[i] - i;
            if(m.containsKey(temp)){
                ans += m.get(temp);
            }
            m.put(temp, m.getOrDefault(temp, 0)+1);
        }
        
        System.out.println(ans);
    }
}