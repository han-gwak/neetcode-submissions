class Solution {
    public boolean isPalindrome(String s) {
        

        if (s == null) {
            return false;
        } else if (s.isEmpty()) {
            return true;
        }

        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
