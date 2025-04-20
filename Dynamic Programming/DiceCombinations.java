import java.util.Arrays;
import java.util.Scanner;

public class DiceCombinations {
    public static int DiceCombWay(int n){
        final int MOD = 1_000_000_007;
        int dp[] =  new int[n+1];

        dp[0] = 1;

        for(int i =1; i<=n; i++){
            for (int j=1; j<=6; j++){
                if(i - j>= 0) {
                    dp[i] = (dp[i] + dp[i-j]) % MOD;
                }
            }
        }


        return dp[n];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.println(DiceCombWay(n));
    }
}
