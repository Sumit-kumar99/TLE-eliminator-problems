import java.util.*;
public class Contrastvalue {
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
        long[] a = new long[n];

        int cnt = 0;

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        ArrayList<Long> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i!=0 && a[i]==a[i-1]){
                cnt++;
                continue;
            }
            list.add(a[i]);
        }
        // System.out.println(list);
        int nn = list.size();
        for(int i=1;i<nn-1;i++){
            // if(a[i]==a[i-1]) cnt++;
            if(list.get(i-1)<list.get(i) && list.get(i)<list.get(i+1)){
                cnt++;
            }
            if(list.get(i-1)>list.get(i) && list.get(i)>list.get(i+1)) cnt++;
        }
        System.out.println(n-cnt);
    }
}

// class Pair{
//     int first;
//     int second;
//     public Pair(int first, int second) {
//         this.first = first;
//         this.second = second;
//     }
    
// }