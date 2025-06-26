import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FriendsAndRestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long arr[] = new long[n];
            long brr[] = new long[n];

            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            for(int i=0;i<n;i++) brr[i] = sc.nextInt();

            ArrayList<Long> list = new ArrayList<>();

            for(int i=0;i<n;i++){
                list.add(brr[i]-arr[i]);
            }
            Collections.sort(list);
            // System.out.println(list);
            int i=0,j=n-1;
            long ans=0;
            while (i<j) {
                if(list.get(i)+list.get(j)>=0){
                    ans++;
                    i++;j--;
                }
                else{
                    i++;
                }
            }
            System.out.println(ans);
            
            
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
