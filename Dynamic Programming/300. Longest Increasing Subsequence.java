class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[][] =  new int[n][n+1];
        int prev = -1;
         for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return fxn(nums,0,prev,dp);
    }
    public static int  fxn(int []nums,int i, int prev,int dp[][]){

        if(i == nums.length) return 0;

        if(dp[i][prev+1] != -1){
            return dp[i][prev+1];
        }
        int exc = fxn(nums,i+1, prev,dp);
        int inc = 0;
        if((prev == -1 || nums[prev] < nums[i]) ){
            inc  = 1+ fxn(nums,i+1,i,dp);
        }
        
        return dp[i][prev+1] = Math.max(inc,exc);
    }
}
