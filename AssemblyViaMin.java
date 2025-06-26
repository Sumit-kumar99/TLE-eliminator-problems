import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AssemblyViaMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            
            int m = (n*(n-1)/2);

            int arr[] = new int[m];
            for(int i=0;i<m;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            
            int k=0,i=1;
            while(k<m){
                System.out.print(arr[k]+" ");
                k+=(n-i);
                i++;
            }
            System.out.println(arr[m-1]);
        }
    }
}
