import java.util.*;;

public class MakeEqualWithMod {
    public static void main(String[] args) {
        long ans = 1000000000000000000L;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            long val = 2;
            while(true){
                HashSet<Long> s = new HashSet<>();
                for(int i=0;i<n;i++){
                    s.add(arr[i]%val);
                }
                if(s.size()==2){
                    System.out.println(val);
                    break;
                }
                val*=2;
            }
            
        }
    } 
}
