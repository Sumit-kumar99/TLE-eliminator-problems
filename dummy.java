import java.util.*;
public class dummy {
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
        // int n = sc.nextInt();
        int[] arr = {1,1,2,2,2,3,3};
        // for(int i=0;i<n;i++){
        int ind = Arrays.binarySearch(arr, 0);
        System.out.println(ind);
            
        // }
    }
}