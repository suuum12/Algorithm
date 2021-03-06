import java.util.Scanner;

public class B1932_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [][] dp = new int[n][n];
        int max = 0;

        dp[0][0] = sc.nextInt();
        for (int i=1; i<n; i++) {
            for (int j=0; j<=i; j++) {
                dp[i][j] = sc.nextInt();

                if (j == 0) {
                    dp[i][j] += dp[i-1][j];
                } else if (i == j) {
                    dp[i][j] += dp[i-1][j-1];
                } else {
                    dp[i][j] += Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
                }

                max = Math.max(dp[n-1][j], max);
            }
        }

        System.out.println(max);
        sc.close();
    }
}
