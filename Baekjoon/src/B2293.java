import java.util.Scanner;

public class B2293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int [] w = new int[n];
        int [] dp = new int[k+1];

        for(int i=0; i<n; i++) {
            w[i] = sc.nextInt();
        }

        dp[0] = 1;

        for(int i=0; i<n; i++) {
            for(int j=1; j<=k; j++) {
                if(j - w[i] >= 0) {
                    dp[j] += dp[j - w[i]];
                }

            }
        }

        System.out.println(dp[k]);
    }
}
