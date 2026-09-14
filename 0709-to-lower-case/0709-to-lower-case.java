class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans= new StringBuilder();
        int len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                ans.append((char)(s.charAt(i)+32));
            }else{
                ans.append(s.charAt(i));
            }
        }
        String str= ans.toString();
        return str;
    }
}