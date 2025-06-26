import java.util.*;
public class yetanother1703F{
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
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }

            ArrayList<Pair> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                if((i+1)>arr[i]){
                    list.add(new Pair(arr[i], i+1));
                }
            }

            Collections.sort(list, (a, b)->Long.compare(a.val, b.val));

            // for(int i=0;i<list.size();i++){
            //     System.out.print(list.get(i).val+" "+list.get(i).ind+"...");
            // }
            // System.out.println();
            long cnt = 0;
            for(int i=0;i<n;i++){
                if((i+1)>arr[i]){
                    long index = i+1;
                    long value = arr[i];
                    
                    int l=0, r=list.size()-1;
                    while(l<=r){
                        int mid = (l+r)/2;
                        if(list.get(mid).val>index){
                            r = mid-1;
                        }
                        else l = mid+1;
                    }
                    cnt += (list.size()-l);
                }
            }
            System.out.println(cnt);

    }    
}

class Pair{
    long val;
    long ind;
    public Pair(long val, long ind) {
        this.ind = ind;
        this.val = val;
    }
}

