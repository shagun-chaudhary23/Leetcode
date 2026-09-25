class Solution {
    public String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);
        if(index == -1){
            return word;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i< word.length();i++){
            if(i<=index){
                sb.insert(i,word.charAt(index-i));
            }else{
                sb.insert(i,word.charAt(i));
            }
        }

        return sb.toString();
    }
}