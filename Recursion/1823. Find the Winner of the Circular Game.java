class Solution {
    public int findTheWinner(int n, int k) {
        return  fnx(n,k) + 1;

        
    }

    public int fnx(int n , int k){
         if(n == 1){
            return 0;
        }
        return (fnx(n-1,k)+k)%n;
    }
}
