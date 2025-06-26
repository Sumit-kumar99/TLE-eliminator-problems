import java.math.BigInteger;
import java.util.*;
public class AnnaandValentine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        // BigInteger comp = BigInteger.TEN.pow(k);

        ArrayList<Pair> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Pair(cntdigit(arr[i]) , cntzero(arr[i]), arr[i]));
        }

        Collections.sort(list, (a, b) -> b.first - a.first);

        int ans = 0;
        for(int i = 0;i<n ;i++){
            int digit = list.get(i).dig;
            int zero = list.get(i).first;
            if(i%2!=0){
                ans += digit;
            }
            else
            ans += (digit - zero);
        }
        // int temp = BigInteger.TEN.pow(ans);
        // System.out.println(ans);
        // int res = comp.compareTo(ans);
        if((k+1)<=ans){
            System.out.println("Sasha");
        }
        else System.out.println("Anna");

        



    }

    static int cntzero(int val){
        int cnt =0;
        while(val>0){
            if(val%10==0){
                cnt++;
                val /= 10;
            }
            else return cnt;
        }
        return cnt;
    }

    static int cntdigit(int val){
        int cnt =0;
        while(val>0){
                cnt++;
                val /= 10;
        }
        return cnt;
    }
}

class Pair{
    int dig;
    int first;
    int second;
    public Pair(int d, int f, int s){
        first = f;
        second = s;
        dig = d;
    }
}

