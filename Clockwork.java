import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Clockwork {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();

        while (t-- > 0) {
            
        solve(sc);
            }
            }
        
        static void solve(Scanner sc){
        int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0;i<n;i++){
                if(arr[i]<=(n-1-i)*2){
                    System.out.println("NO");
                    return;
                }
            }

            for(int i=0;i<n;i++){
                if(arr[i]<=(i)*2){
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
    }
}
