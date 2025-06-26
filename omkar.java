import java.util.*;
public class omkar {
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
            int k = -1;
            // int i = 1;
            int ans = Integer.MAX_VALUE;
            int a = -1, b=-1;
            if(n%2==0){
                System.out.println((n/2)+" "+(n/2));
                return;
            }
            else{
                // int val = n;
                for (int i = 2; i * i <= n; i++) {
                    if (n % i == 0) {
                        k = i;
                        break;
                    }
                } 
                if(k==-1){
                    a = 1;
                    b = n-1;
                }  
                else{
                    a = (n/k);
                    b = n - a;
                }
            }


            System.out.println(a+" "+b);
            
    }
        
       
}