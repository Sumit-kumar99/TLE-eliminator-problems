import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            // long k = sc.nextLong();
            // long x = sc.nextLong();
            int[] arr = new int[n];
            int[] brr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                brr[i] = sc.nextInt();
            }

            int newArr[] = new int[n];
            boolean[] vis = new boolean[n];
            int cnt = 0;
            for(int i=0;i<n;i++){
                while(vis[brr[i]-1]==false){
                    vis[brr[i]-1]=true;
                    cnt++;
                    brr[i] = arr[brr[i]-1];
                }
                if(vis[brr[i]-1]==true) newArr[i] = cnt;
            }

            for(int i : newArr){
                System.out.print(i+" ");
            }
            System.out.println();


        }
    }
}
