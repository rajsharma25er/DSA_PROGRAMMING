class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int count = 0;


        for(int i = 0; i<n; i++){
            int left = colors[i];
            int mid = (colors[(i+1)%n]);
            int right = (colors[(i+2)%n]);

            if(left != mid && mid != right && left == right){
                count++;
            }
            
        }
        return count;

    }
}
