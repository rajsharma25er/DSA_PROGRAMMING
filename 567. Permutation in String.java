class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> mp = new HashMap<>();

        for (char c : s1.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        int i = 0, j = 0;
        int tcount = s1.length();

        while (j < s2.length()) {
            char endChar = s2.charAt(j);
            
            if (mp.containsKey(endChar)) {
                if (mp.get(endChar) > 0) {
                    tcount--;
                }
                mp.put(endChar, mp.get(endChar) - 1);
            }

            if (j - i + 1 == s1.length()) {
                if (tcount == 0) return true;

                char startChar = s2.charAt(i);
                
                if (mp.containsKey(startChar)) {
                    mp.put(startChar, mp.get(startChar) + 1);
                    if (mp.get(startChar) > 0) {
                        tcount++;
                    }
                }
                i++;
            }

            j++;
        }

        return false;
    }
}
