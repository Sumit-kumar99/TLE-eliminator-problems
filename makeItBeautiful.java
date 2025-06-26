import java.util.*;
public class makeItBeautiful{
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
            long k = sc.nextLong();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            long ans = 0;
            PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Long.compare(a.first, b.first));

            for(int i=0;i<n;i++){
                for(int j=0;j<64;j++){
                    if((arr[i] & (1L << j)) == 0){
                        pq.add(new Pair(1L << j,  arr[i]));
                        break;
                    }
                }
                for(int j=0;j<64;j++){
                        if((arr[i] & (1L << j)) != 0){
                            ans++;
                        }
                }

            }

            while(k>0){
                Pair p = pq.poll();
                long kk = p.first;
                long vv = p.second;
                k = k - kk;
                if(k<0) break;
                ans++;
                vv += kk;
                for(int j=0;j<64;j++){
                        if((vv & (1L << j)) == 0){
                            pq.add(new Pair(1L << j, vv));
                            break;
                        }
                }
            }

            System.out.println(ans);


    }    
}



class Pair{
    long first;
    long second;
    public Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

