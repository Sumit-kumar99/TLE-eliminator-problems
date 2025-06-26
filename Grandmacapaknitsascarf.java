import java.util.*;
public class Grandmacapaknitsascarf {
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
        String s = sc.next();
        char[] ch = s.toCharArray();
        // int i=0, j=n-1;
        int[] arr = new int[26];

        for(int i=0;i<n;i++){
            arr[ch[i]-'a']++;
        }
        int mini = Integer.MAX_VALUE;

        for(int k=0;k<26;k++){
            if(arr[k]!=0){
                char c = (char)('a'+ k);
                int i=0, j= n-1;
                int cnt = 0;
                while(i<j){
                    if(ch[i]==ch[j]){
                        i++;
                        j--;
                    }
                    else{
                        if(ch[i]!=c && ch[j]!=c){
                            cnt = Integer.MAX_VALUE;
                            break;
                        }
                        if(ch[i]==c){
                            i++;
                            cnt++;
                        }
                        if(ch[j]==c){
                            j--;
                            cnt++;
                        }
                    }
                }
                mini = Math.min(cnt, mini);
            }
        }

        if(mini == Integer.MAX_VALUE) {
            System.out.println(-1); return;
        }
        System.out.println(mini);
        
        
    }
}