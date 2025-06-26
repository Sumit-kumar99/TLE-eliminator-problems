import java.util.*;

public class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            
            if (K > N || (N > 1 && K == N - 1)) {
                output.append("-1\n");
                continue;
            }
            
            char[] S = new char[N];
            char[] T = new char[N];
            char[] choices = {'A', 'B', 'C'};
            
            for (int i = 0; i < K; i++) {
                S[i] = choices[i % 3];
                T[i] = choices[i % 3];
            }
            
            for (int i = K; i < N; i++) {
                S[i] = choices[(i % 3)];
                T[i] = choices[((i + 1) % 3)];
            }
            
            output.append(new String(S)).append("\n");
            output.append(new String(T)).append("\n");
        }
        
        System.out.print(output);
        scanner.close();
    }
}
