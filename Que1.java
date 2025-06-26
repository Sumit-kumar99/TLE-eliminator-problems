import java.util.*;
public class Que1 {
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
        int[] arr = new int[n];
        int[] brr = new int[n];
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            s.add(arr[i]);
        }
        HashSet<Integer> s1 = new HashSet<>();
        for(int i=0;i<n;i++){
            brr[i] = sc.nextInt();
            s1.add(brr[i]);
        }

        if(s.size()>=3){
            System.out.println("YES");
            return;
        }
        if(s1.size()>=2 && s.size()>=2){
            System.out.println("YES");
            return;
        }
        if(s1.size()>=3){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
        return;

        
    }
    
}
