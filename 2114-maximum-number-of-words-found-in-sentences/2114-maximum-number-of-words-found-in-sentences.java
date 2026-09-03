class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(String str:sentences){
            String newStr[]=str.split(" ");
            int len= newStr.length;
            if(len>count){
                count=len;
            }
        }
        return count;
    }
}