import java.util.*;
public class E11846 {
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
        
        
        for(int i=2;i<1000;i++){
            int sum = 1 + i;
            int x = i*i;
            for(int j=2;j<=20;j++){
                sum+=x; 
                if(sum>1000000) break;
                    if((sum)==n){
                        System.out.println("YES");
                        return;
                    }
                
                x *= i;
            } 
        }
        System.out.println("NO");
        return;
    }
}