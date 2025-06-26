import java.util.*;

public class DoraAndSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t -- > 0 ) {
            int n = sc.nextInt();

            int arr[] = new int[n];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i]);
            }

            int i=0;
            int j=n-1;
            boolean flag = false;
            while ((j-i)>=3) {
                int t1 = i;
                int t2 = j;
                if(arr[i]==min){
                    i++;
                    min++;
                }
                else if(arr[i]==max){
                    i++;
                    max--;
                }
                if(arr[j]==min){
                    j--;
                    min++;
                }
                else if(arr[j]==max){
                    j--;
                    max--;
                }
                if(t1==i && t2==j){
                    System.out.println((i+1)+" "+(j+1));
                    flag = true;
                    break;
                }
            }
            if(!flag)
            System.out.println(-1);            
        }
    }    
}
