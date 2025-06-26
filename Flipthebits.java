import java.util.*;
public class Flipthebits {
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
        String s1 = sc.next();
        String s2 = sc.next();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        ArrayList<Pair> list = new ArrayList<>();
        int zero = 0, one =0;
        int k = 0;
        for(int i=0;i<n;i++){
            if(c1[i] == '0') zero++;
            if(c1[i] == '1') one++;
            if(one==zero){
                list.add(new Pair(k, i));
                k = i+1;
            }
        }

        for(Pair p : list){
            int i = p.first;
            int j = p.second;
            if(c1[i]==c2[i]) continue;
            else{
                flip(c1, i, j);
            }
        }
        for(int i=0;i<n;i++){
            if(c1[i]!=c2[i]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }

    static void flip(char[] c, int i, int j){
        for(int k=i;k<=j;k++){
            if(c[k]=='0') c[k] = '1';
            else c[k] = '0';
        }
    }
}

class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}