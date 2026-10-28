class Solution {
    public String reverseWords(String s) {
        if(s.length()==0){
            return "";
        }
        String st=s.trim();
        String[] words=st.split("\\s+");
        StringBuilder sb= new StringBuilder();
        int n=words.length;
        for(int i=n-1;i>=0;i--){
            String w=words[i];
            sb.append(w).append(" ");
        }
        return sb.toString().trim();
    }
}