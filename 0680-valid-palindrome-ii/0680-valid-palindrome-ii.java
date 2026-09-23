class Solution {
    public boolean validPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != rev.charAt(i)) {
                String str1 = s.substring(0, i) + s.substring(i + 1);
                String rev1 = new StringBuilder(str1).reverse().toString();
                
                int j = s.length() - 1 - i;
                String str2 = s.substring(0, j) + s.substring(j + 1);
                String rev2 = new StringBuilder(str2).reverse().toString();
                
                return str1.equals(rev1) || str2.equals(rev2);
            }
        }
        
        return true;
    }
}