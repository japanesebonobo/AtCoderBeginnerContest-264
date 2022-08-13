import java.util.Scanner;

public class B_Ancestor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int DP[] = new int[N];

        for (int i = 1; i < DP.length; i++) {
            DP[i] = scanner.nextInt()-1; 
        }
        scanner.close();

        int now = N-1;
        int ans = 0;

        while(now > 0) {
            ans++;
            now = DP[now];
        }

        System.out.println(ans);
    }
}
