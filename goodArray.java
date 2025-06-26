import java.util.*;
public class goodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            solve(sc);
        // }
        sc.close();
    }

    public static void solve(Scanner sc) {
        // Your code here
        
            // long k = sc.nextLong();
            // long x = sc.nextLong();
            // int i = 1;

            int n = sc.nextInt();
            long[] arr = new long[n];
            long sum = 0;
            Map<Long, Long> m = new HashMap<>();
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
                sum += arr[i];
                m.put(arr[i], m.getOrDefault(arr[i], 0L)+1L);
            }
            int cnt = 0;
            // System.out.println(sum);
            // System.out.println(m);
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                if((sum - arr[i])%2==1){
                    continue;
                }
                else{
                    long z = (sum - arr[i])/2;
                    // System.out.println(z);
                    m.put(arr[i], m.get(arr[i])-1);
                    if(m.get(arr[i])==0){
                        m.remove(arr[i]);
                    }

                    if(m.containsKey(z)){
                        list.add((int)(i+1));
                    }
                    m.put(arr[i], m.getOrDefault(arr[i], 0L)+1L);
                }
            }
            System.out.println(list.size());
            // System.out.println(list);
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }   
            System.out.println();   
            
    }
        
       
}