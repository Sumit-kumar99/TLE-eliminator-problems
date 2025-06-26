import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    public static void solve(Scanner sc){
        // Your code here
            int a = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x>y){
                if(a>=y && a<=x){
                    System.out.println("NO");
                    return;
                }
            }
            if(x<y){
                if(a<=y && a>=x){
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
            return;

            
    }
}