class Solution {
    private static final long M = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long res = power(20 , n/2)%M;
        if(n % 2 == 1){
            return (int)((5 * res)%M);
        } 
        else{
            return (int) res;
        }

     }
    public long power(int  n  , long r){
        if(r == 0){
            return 1;
        }
        if(r == 1){
            return n % M;
        }

        
        long t = power(n , r/2)%M;
        long res  = (t * t) % M;
         
         if(r % 2 == 1) {
            res = (res * n) % M;
         }
         
         return res;
    }
}
