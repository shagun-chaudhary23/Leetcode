class Solution {
    public boolean isPalindrome(String s) {
        String org="";
        String ls=s.toLowerCase();
        for(int i=0;i<ls.length();i++){
            char ch=ls.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                org=org+ch;
            }
        }
        int len=org.length();
        String rev="";
        for(int i=0;i<len;i++){
            rev=rev+org.charAt(len-1-i);
        }
        return rev.equals(org);
    }
}