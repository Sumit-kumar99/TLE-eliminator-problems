import java.util.*;
public class Makethemequal {
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
        // int n = sc.nextInt();
        int n = sc.nextInt();
        String c = sc.next();
        String s = sc.next();
        int cnt = 0;
        int ind = -1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c.charAt(0)) cnt++;
            if(ind==-1 && i>=(n/2)){
                if(s.charAt(i)==c.charAt(0)){
                   ind = i;
                }
            }
        }
        if(cnt==n){
            System.out.println(0);
            return;
        }

        if(ind!=-1){
            System.out.println(1);
            System.out.println(ind+1);
            return;
        }
        if(ind == -1){
            System.out.println(2);
            System.out.print(n-1+" ");
            System.out.println(n);
            return;
        }

    }
}