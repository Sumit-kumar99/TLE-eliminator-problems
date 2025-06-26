import java.util.*;
public class D1931 {
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
        long x = sc.nextLong();
        long y = sc.nextLong();

        long[] arr = new long[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Map<Pair, Long> map = new HashMap<>();
        
        long res = 0;
        for (long e : arr) {
            long xx = e % x;
            long yy = e % y;
            Pair key = new Pair((x - xx) % x, yy);
            res += map.getOrDefault(key, 0L);
            Pair newKey = new Pair(xx, yy);
            map.put(newKey, map.getOrDefault(newKey, 0L) + 1);
        }

        System.out.println(res);

    }
}

class Pair{
    long first;
    long second;
    public Pair(long xx, long yy) {
            this.first = xx;
            this.second = yy;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return first == pair.first && second == pair.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
    
}