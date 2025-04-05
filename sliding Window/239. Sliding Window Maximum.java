class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n =  nums.length;
        int[] res = new int[n - k + 1];
        int i = 0;
        int j = 0;
        Deque<Integer> dq = new ArrayDeque<Integer>();
        while(j<n){

            while(!dq.isEmpty() && dq.peekLast()<nums[j]){
                dq.pollLast();
            }
            dq.addLast(nums[j]);
            if(j-i+1 == k){
                 res[i] = dq.peekFirst();
                
                if(dq.peekFirst()== nums[i]){
                        dq.pollFirst();
                        
                    }
                    i++;
                }
                j++;
            }
            return res;
        }
}
