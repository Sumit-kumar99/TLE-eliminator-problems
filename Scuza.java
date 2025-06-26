import java.util.*;
public class Scuza {
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

        long a[] = new long[n];
        long b[] = new long[q];

        for(int i=0;i<n;i++){
            a[i]= sc.nextLong();
        }
        for(int i=0;i<q;i++){
            b[i]= sc.nextLong();
        }
        long[] perfixOfMax = new long[n];
        perfixOfMax[0] = a[0];
        for(int i=1;i<n;i++){
            perfixOfMax[i] = Math.max(perfixOfMax[i-1], a[i]);
            a[i] += a[i-1];
        }

        int j = 0;
        for(int i=0;i<q;i++){
            int l = 0, r= n-1;
            int mid = -1;
            while(l<=r){
                mid = (l+r)/2;
                if(perfixOfMax[mid]>b[i]){
                    r = mid-1;
                }
                else if(perfixOfMax[mid]<=b[i]){
                    l = mid+1;
                }
            }
            if(r==-1){
                System.out.print(0+" ");
                continue;
            }
            System.out.print(a[r]+" ");
        }
        System.out.println();
    }
}