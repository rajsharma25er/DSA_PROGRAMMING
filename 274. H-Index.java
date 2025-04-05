class Solution {
    public int hIndex(int[] citations) {
      int n = citations.length; 

      int left = 0;
      int right = n;
      int res = -1;
       
      while(left <= right){
        int mid = left + (right-left)/2;

        if(fnx(citations,mid) == true){
            res = mid ;
            left = mid +1;
        }
        else{
            right = mid -1;
        }

      }
      return res;


    }
    public boolean fnx(int[] arr ,  int mid){
        int count =0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] >= mid){
                count++;
            }
        }
        return count>=mid?true:false;
    }
}
