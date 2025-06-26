import java.util.*;

public class findthelisterentone {
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

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[][] query = new int[q][2];
        for(int i = 0; i < q; i++) {
            query[i][0] = sc.nextInt();
            query[i][1] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= n - 1; i++){
            if(i==n-1 && arr[i]!=arr[i-1]){
                list.add(i + 1); 
            }
            else if(i!=n-1 && arr[i] != arr[i + 1]){
                list.add(i + 1); 
            }
        }
        // System.out.println(list);
        for(int i = 0; i < q; i++){
            int a = query[i][0];
            int b = query[i][1];

            int l = 0, r = list.size() - 1;
            int ans = -1;
            while(l <= r) {
                int mid = (l + r) / 2;
                if(list.get(mid) >= a && list.get(mid) < b) {
                    ans = list.get(mid);
                    r = mid - 1; 
                } else if(list.get(mid) < a) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

            if(ans == -1) {
                System.out.println("-1 -1");
            } else {
                System.out.println(ans + " " + (ans + 1));
            }
        }
        System.out.println();
    }
}
