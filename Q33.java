import java.util.*;
public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
                maxi = Math.max(maxi, arr[i][j]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==maxi){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] =0;
                }
            }
        }

        int row[] = new int[n];
        int max1=0;
        int rind = -1, rmax=0, cmax=0;
        for(int i=0;i<n;i++){
            int cnt = 0;
            for(int j=0;j<m;j++){
                cnt += arr[i][j];
            }
            row[i] = cnt;
            max1 = Math.max(max1, row[i]);
        }

        int col[] = new int[m];
        int max2=0;
        for(int j=0;j<m;j++){
            int cnt = 0;
            for(int i=0;i<n;i++){
                cnt += arr[i][j];
            }
            col[j] = cnt;
            max2 = Math.max(max2, col[j]);
        }


        // System.out.println(max1+" "+max2);

        if(max1>=max2){
            for(int i=0;i<n;i++){
                if(row[i]==max1){
                    for(int j=0;j<m;j++){
                        arr[i][j] = 0;
                    }
                    break;
                }
            }

            max2=0;
            for(int j=0;j<m;j++){
            int cnt = 0;
            for(int i=0;i<n;i++){
                cnt += arr[i][j];
            }
            col[j] = cnt;
            max2 = Math.max(max2, col[j]);
            }

            for(int j=0;j<m;j++){
                if(col[j]==max2){
                    for(int i=0;i<n;i++){
                        arr[i][j] = 0;
                    }
                    break;
                }
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(arr[i][j]==1){
                        System.out.println(maxi);
                        return;
                    }
                }
            }

            System.out.println(maxi-1);
            return;

        }
        else{

            for(int j=0;j<m;j++){
                if(col[j]==max2){
                    for(int i=0;i<n;i++){
                        arr[i][j] = 0;
                    }
                    break;
                }
            }

            max1=0;
            for(int i=0;i<n;i++){
            int cnt = 0;
            for(int j=0;j<m;j++){
                cnt += arr[i][j];
            }
            row[i] = cnt;
            max1 = Math.max(max1, row[i]);
            }

            for(int i=0;i<n;i++){
                if(row[i]==max1){
                    for(int j=0;j<m;j++){
                        arr[i][j] = 0;
                    }
                    break;
                }
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(arr[i][j]==1){
                        System.out.println(maxi);
                        return;
                    }
                }
            }

            System.out.println(maxi-1);
            
            

        }
        // System.out.println();
        return;

        

        
    }
}

class Pair{
    int first;
    int second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    
}