class Solution {
    public boolean isAnagram(String s, String t) {
       Map<Character, Integer> charCount = new HashMap<>();

       for (char c : s.toCharArray()) {
        Integer count = charCount.getOrDefault(c, 0);
        count++;
        charCount.put(c, count);
       }

       for (char c : t.toCharArray()) {
        Integer count = charCount.getOrDefault(c, 0);
        count--;
        charCount.put(c, count);
       }

       for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
        if (entry.getValue() != 0) {
            return false;
        }
       }
       return true;
    }
}
