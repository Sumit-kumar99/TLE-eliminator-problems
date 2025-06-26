import java.util.Arrays;
import java.util.Scanner;

public class removeSmallestMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            
            String s = sc.next();
            char[] arr = new char[n];
            long ans = 0;
            Arrays.fill(arr, '1');
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0'){
                    for(int j=i+1;j<=n;j+=i+1){
                        if(s.charAt(j-1)=='1'){
                            break;
                        }
                        if(arr[j-1]=='0'){
                            continue;
                        }
                        arr[j-1] = '0';
                        ans+=(i+1);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
