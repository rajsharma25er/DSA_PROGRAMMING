class Solution {
    public int minDistance(String s1, String s2) {
       int n =  s1.length();
       int m = s2.length();
       int [][] dp = new int[n+1][m+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1); 
        }
       return fxn(s1,n,s2,m,dp);

    }
    public int fxn(String s1, int n , String s2, int m,int dp[][]){
        if(n ==0 && m ==0) return 0;
        if(m==0 && n>0) return n;
        if(n==0 && m>0) return m;

        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return fxn(s1,n-1,s2,m-1,dp);
        } 
          return   dp[n][m] = Math.min(1+fxn(s1,n,s2,m-1,dp),Math.min(1+fxn(s1,n-1,s2,m,dp),1+fxn(s1,n-1,s2,m-1,dp)));
        
    }
}
