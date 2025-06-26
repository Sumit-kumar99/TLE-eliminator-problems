import java.util.*;
public class q4 {
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

        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        // int greater[] = new int[n];
        // int smaller[] = new int[n];
        
        int l=0;
        int r=0;
        int temp = 0;
        for(int i=0;i<n;i++){
            int big = 0;
            int small=0;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]) big++;
                else if(arr[i]>arr[j]) small++;
                int diff = big-small;
                if(diff<temp){
                    temp = diff;
                    l = i;
                    r = j;
                }
            }
        }

        System.out.println((l+1)+" "+(r+1));



    }
}