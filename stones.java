import java.util.*;

public class stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt(); // number of moves
        int k = sc.nextInt(); // total stones
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] arr = new int[k + 1]; // 0 = losing, 1 = winning

        Arrays.sort(nums);

        for (int i = 0; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                int move = nums[j];
                if (i - move >= 0 && arr[i - move] == 0) {
                    arr[i] = 1; // if any previous state is losing, current is winning
                    break;
                }
            }
        }
        for(int i=0;i<=k;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println(arr[k] == 1 ? "First" : "Second");
    }
}
