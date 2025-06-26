import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Grid {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[][] s = new int[n][n];
            for(int i=0;i<n;i++){
                String st = sc.next();
                for(int j=0;j<n;j++){
                    s[i][j] = (int)(st.charAt(j)-'0');
                }
            }
            int vis[][] = new int[n][n];
            for(int i=0;i<n;i++) Arrays.fill(vis[i], -1);
            int ans = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                        int val = s[i][j]+s[j][n-i-1]+s[n-i-1][n-j-1]+s[n-j-1][i];
                        int min = Math.min(val,4-val);
                        ans+=min;
                }
            }
            System.out.println(ans/4);
            
            
        }
    }
    
}

// class Pair{
//     int first;
//     int second;
//     public Pair(int first, int second){
//         this.first = first;
//         this.second = second;
//     }
// }


