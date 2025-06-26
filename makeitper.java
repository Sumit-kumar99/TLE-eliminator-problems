import java.util.*;
public class makeitper{
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
        
        System.out.println(2*n - 1);
        int j = 1;
        for(int i=0;i<n-1;i++){
            System.out.println((i+1)+" "+1+" "+j);
            System.out.println((i+1)+" "+(++j)+" "+n);
            // j++;
        }
        System.out.println(n+" "+1+" "+n);


    }    
}





