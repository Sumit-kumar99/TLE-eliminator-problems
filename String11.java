import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class String11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            String s = sc.next();
            int cnt = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1') cnt++;
            }
            System.out.println(cnt);
        }
    }    
}
