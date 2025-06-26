import java.util.*;
public class Dejavu {
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
        int q = sc.nextInt();

        long[] arr = new long[n];
        long[] brr = new long[q];

        Map<Long, Long> m = new HashMap<>();
        long[] sorted = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sorted[i] = arr[i];
            m.put(arr[i], m.getOrDefault(arr[i], arr[i]));
        }
        for(int j=0;j<q;j++){
            brr[j] = sc.nextInt();
        }

        Arrays.sort(sorted);

        for(int x = 0;x< q;x++){
            double temp = 1<< brr[x];
            for(int i=n-1;i>=0;i--){
                if(sorted[i]<temp) break;
                if(sorted[i]%temp == 0){
                    long val = m.get(sorted[i]) + (int)(temp/2);
                    m.put(sorted[i], val);
                }
            }
        }

        for(int i=0;i<n;i++){
            if(m.containsKey(arr[i])){
                System.out.print(m.get(arr[i])+" ");
            }
        }
        System.out.println();
    }
}