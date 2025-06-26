import java.util.*;
public class SorttheSubarray {
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
        int[] brr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            brr[i] = sc.nextInt();
        }
        int ind = -1;
        for(int i=0;i<n;i++){
            if(arr[i]!=brr[i]){
                ind = i;
                break;
            }
        }
        int ind1 = ind, ind2=ind;
        while(ind1>0 && brr[ind1-1]<=brr[ind1]){
            ind1--; 
        }
        while(ind2<n-1 && brr[ind2]<=brr[ind2+1]){
            ind2++; 
        }
        ind1++;
        ind2++;
        System.out.print(ind1+" "+ind2);
        System.out.println();


    }
}