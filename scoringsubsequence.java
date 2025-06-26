import java.util.*;
public class scoringsubsequence {
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
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                int l=0, r=i;
                while(l<=r){
                    int mid = (l+r)/2;
                    int len = i - mid + 1;
                    if(arr[mid]/len >= 1)r = mid-1;
                    else l = mid+1;
                }
                System.out.print(i-l+1+" ");
            }
            System.out.println();
            
            
    }
        
       
}