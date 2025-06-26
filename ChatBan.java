import java.util.*;
public class ChatBan {
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
        
            long k = sc.nextLong();
            long x = sc.nextLong();
            // int i = 1;
            
            long l = 1, r = 2*k - 1;

            long cntk = (k)*(k+1)/2;
            long cntkminus = (k)*(k-1)/2;
             
            if(cntk + cntkminus < x){
                System.out.println(r);
                return;
            }

            while(l<=r){
                long mid = (l+r)/2;
                // System.out.println(mid+" "+temp);
                if(cntk>=x){
                    long temp = (mid)*(mid+1)/2;
                    if(temp>=x){
                        r = mid-1;
                    }
                    else l = mid+1;
                }
                else{
                    long temp = cntk + cntkminus - (2*k - 1 - mid) * (2*k - mid) / 2;
                    // System.out.println( temp);
                    if(temp>=x){
                        r = mid-1;
                    }
                    else l = mid+1;
                }
                
            }
            System.out.println(l);
            // System.out.println();
            
    }
        
       
}