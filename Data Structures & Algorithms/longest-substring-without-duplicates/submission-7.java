class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left, right;
        int result = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> charSet = new HashSet<>();
            for (int j = i; j < n; j++) {
                if (charSet.contains(s.charAt(j))) {
                    break;
                }
                charSet.add(s.charAt(j));
            }
            result = (charSet.size() > result) ? charSet.size() : result;
        }
        return result;
    }

}
