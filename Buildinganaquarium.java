import java.util.*;
public class Buildinganaquarium {
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
        int x = sc.nextInt();

        long[] arr = new long[n];
        for( int i=0;i<n;i++) arr[i] = sc.nextLong();
        Arrays.sort(arr);
        long[] narr = new long[n];
        long[] na = new long[n];
        long temp =0;
        for(int i=0;i<n;i++){
            temp += arr[i];
            narr[i] = temp;
            na[i] = arr[i]*(i+1);
        }
        long ind1 = -1, ind2=-1;
        long key = -1;
        long v = 0;
        for(int i=0;i<n;i++){
            long val = na[i] - narr[i];
            if(val==x){
                System.out.println(arr[i]);
                return;
            }
            if(val>x){
                key = i-1;
                ind1 = arr[i-1];
                ind2 = arr[i];
                v = na[i];
                break;
            }
        }

        for(long i=ind1; i <= ind2;i++){
            if()
        }
    }
}