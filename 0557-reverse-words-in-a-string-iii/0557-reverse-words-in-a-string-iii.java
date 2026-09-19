class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        for(String word :s.split(" ")){
            if (ans.length() > 0) {
                ans.append(" ");
            }
            ans.append(new StringBuilder(word).reverse());
        }
        return ans.toString();
    }
}