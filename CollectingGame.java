import java.util.*;
public class CollectingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];
        long sum = 0L;
        long[] prefSum = new long[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            brr[i] = arr[i];
        }
        Arrays.sort(arr);

        for(int i = 0;i<n;i++){
            sum += arr[i];
            prefSum[i] = sum;
        }

        int ans[] = new int[n];
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=n-1;i>=0;i--)
        {
            if(i==n-1){
                ans[i] = n-1;
                m.put(arr[i],n-1);
                continue;
            }
            if(prefSum[i]>=arr[i+1]){
                ans[i] = ans[i+1];
            }
            else{
                ans[i] = i;
            }
            m.put(arr[i], ans[i]);
        }
        // System.out.println(m);
        for(int i=0;i<n;i++){
            System.out.print(m.get(brr[i])+" ");
        }
        System.out.println();
    }
}