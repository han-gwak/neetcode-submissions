class Solution {
    public boolean isPalindrome(int x) {
        String asString = "" + x;
        for (int i = 0, j = asString.length() - 1; i < j; i++, j--) {
            if (asString.charAt(i) != asString.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}