import java.util.*;

public class Virus {
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
        int m = sc.nextInt();
        int arr[] = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int gaps[] = new int[m];
        for (int i = 0; i < m - 1; i++) {
            gaps[i] = arr[i + 1] - arr[i] - 1;
        }
        gaps[m - 1] = (n - arr[m - 1] + arr[0] - 1);

        Arrays.sort(gaps);
        
        int saved = 0, days = 0;
        for (int i = m - 1; i >= 0; i--) {
            int remainingGap = gaps[i] - (2 * days);
            if (remainingGap > 0) {
                saved += Math.max(1, remainingGap - 1);
                days += 2;
            } else {
                break;
            }
        }

        System.out.println(n - saved);
    }
}
