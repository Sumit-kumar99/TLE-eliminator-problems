import java.util.*;

public class CirnoAndOp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }
        long ans = 0;
        for (long num : list) {
            ans += num;
        }
        if (n == 1) {
            System.out.println(list.get(0));
            return;
        }
        while (n > 1) {
            long sum1 = 0, sum2 = 0;
            for (int i = 0; i < n - 1; i++) {
                sum1 += list.get(i + 1) - list.get(i);
            }
            for (int i = n - 1; i > 0; i--) {
                sum2 += list.get(i - 1) - list.get(i);
            }
            List<Long> temp = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                temp.add(list.get(i + 1) - list.get(i));
            }
            list = temp;
            n--;
            ans = Math.max(Math.max(Math.abs(sum1), Math.abs(sum2)), ans);
        }
        ans = Math.max(ans, Math.abs(list.get(0)));
        System.out.println(ans);
    }
}
