import java.util.*;

public class EraseFirstOrSecondLetter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            HashSet<Character> st = new HashSet<>();
            // solve(s,st);
            // System.out.println(st.size());
            int ans = 0;
            for(int i=0;i<n;i++){
                char c = s.charAt(i);
                if(st.contains(c)){
                    continue;
                }
                else{
                    st.add(c);
                    ans+=(n-i);
                }
            }
            System.out.println(ans);       
         }
    }
            
    // static void solve(String s, HashSet<String> st){
    //     if(s.length()==1){
    //         st.add(s);
    //         return;
    //     }
    //     st.add(s);
    //     solve(s.substring(1, s.length()), st);
    //     solve(s.substring(0, 1)+s.substring(2,s.length()), st);
    // }
}