import java.util.*;
public class D1927 {
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

        int q = sc.nextInt();
        int a[][] = new int[q][2];
        for(int i=0;i<q;i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }

        int sum[] = new int[n+1];
        int temp = 0;
        for(int i=1;i<=n;i++){
            temp += arr[i-1];
            sum[i] = temp;
        }

        for(int k=0;k<q;k++){
            if(a[k][0]!=a[k][1]){
                System.out.println(a[k][0]+" "+a[k][1]);
                // continue;
            }
            else{
                int s = arr[a[k][1]-1] - arr[a[k][0]-1] +1 ;
                if(( s*arr[a[k][1]-1] ) == sum[a[k][1]-1] - sum[a[k][0]-2]){
                    System.out.println(-1 +" "+-1);
                }
                else{
                    int l = a[k][0]-1;
                    int ans1 = l;
                    int r = a[k][1]-1;
                    int mid = -1;
                    while(l<=r){
                        mid = (l+r)/2;
                        if((mid-l)*arr[ans1]==(sum[mid]-sum[l])){
                            l = mid+1;
                        }
                        else if((r-mid)*arr[ans1]==(sum[r]-sum[mid])){
                            r = mid-1;
                        }
                        else{
                            if(arr[mid]!=arr[ans1]){
                                System.out.println((ans1+1)+" "+(mid+1));
                                break;
                            }
                            l = mid+1;
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}