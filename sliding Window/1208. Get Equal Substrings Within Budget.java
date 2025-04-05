class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i =0;
        int j =0;
        int cost = 0;
        int maxlen =0;
        while(j<s.length()){
            cost += Math.abs(s.charAt(j)- t.charAt(j));

            while(cost > maxCost){
                cost -= Math.abs(s.charAt(i) - t.charAt(i));
                i++;
            }
            maxlen = Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;

    }
}
