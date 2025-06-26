import java.util.*;

class StoneAgeProblem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] arr = new long[n];
        long sum = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            sum += arr[i];
        }
        long gValue = -1;
        Map<Integer, Long> m = new HashMap<>();
        while (q-- > 0) {
            int t = sc.nextInt();
            int ind = -1;
            if(t == 1) {
                ind = sc.nextInt();
            }
            long val = sc.nextLong();

            if(ind == -1) {
                sum = n * val;
                System.out.println(sum);
                gValue = val;
                m.clear();
            } else {
                long value = 0;
                if(m.containsKey(ind - 1)) {
                    value = - m.get(ind - 1) + val;
                } else if(gValue != -1) {
                    value = - gValue + val;
                } else {
                    value = val - arr[ind - 1];
                }
                arr[ind - 1] = val;
                m.put(ind - 1, val);
                sum += value;
                System.out.println(sum);
            }
        }
    }
}
