class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n =  nums.length;
        long dp[][] =  new long[n+1][2];
        for (long[] row : dp) {
            Arrays.fill(row, -1);
        }

        

        return fxn(nums,n,0,true,dp);
    }

    public long fxn(int[] nums ,int n, int i , boolean flag ,long dp[][]){

        if(i >= n){
            return 0;

        }
        int f = flag ? 1 : 0;
        if(dp[i][f] != -1){
            return dp[i][f];
        }
        long ex = fxn(nums,n,i+1,flag,dp);

        long val  = nums[i];
        if(flag == false) val = -val;

        long inc = val+ fxn(nums,n,i+1,!flag,dp);

        return dp[i][f] = Math.max(ex,inc);

    }
}
