class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res =new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        fnx(res, temp,candidates,0,target);
        return res;
    }
    public void fnx(List<List<Integer>>res , List<Integer> temp,int[] arr,int i,int target){
        if(i == arr.length){
            if(target == 0){
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        if(arr[i]<= target){
            temp.add(arr[i]);
            fnx(res,temp,arr,i,target-arr[i]);
            temp.remove(temp.size() - 1);
        }
        fnx(res,temp,arr,i+1,target);

    }

}
