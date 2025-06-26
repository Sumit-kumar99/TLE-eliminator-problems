import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt(); 

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<n-1; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
        }

        boolean found = false;
        int a = -1, b = -1, c = -1;

        for(int u = 1; u <= n; u++){
            for(int v : adj.get(u)){
                for(int w : adj.get(v)){
                    if(w != u){ 
                        a = u;
                        b = v;
                        c = w;
                        found = true;
                        break;
                    }
                }
                if(found) break;
            }
            if(found) break;
        }

        if(!found){
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
        System.out.println(a + " " + b);
        System.out.println(b + " " + c);

        adj.get(a).remove(Integer.valueOf(b));
        adj.get(b).remove(Integer.valueOf(c));


        
        for(int i=1; i<=n; i++){
            for(int v : adj.get(i)){
                    System.out.println(v + " " + i);
            }
        }
    }
}
