import java.util.*;
public class Catcycle {
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
        int k = sc.nextInt();

        if (n%2==0) {
            int m = k%n;
            if(m==0){
                System.out.println(n);
                return;
            }
            else{
                System.out.println(m);
                return;
            }
        }
        else{
            int m = k%n;
            int d = k/n;
           
                int temp = ((2*d)+m)%n;
                if(temp==0)
                    System.out.println(n);
                else System.out.println(temp);
                return;    
            
            
        }
    }
}