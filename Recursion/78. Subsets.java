class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        fnx(res, new ArrayList<>(),nums,0);
        return res;
    }
    public void fnx(List<List<Integer>> res,List<Integer> ans,int[] nums , int i){
        if(i == nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[i]);

        fnx(res,ans,nums,i+1);
        ans.remove(ans.size()-1);
        fnx(res,ans,nums,i+1);

    }
}
