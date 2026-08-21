class Solution {
    public String sortSentence(String s) {
        String words[]=s.split(" ");
        String result[]=new String[words.length];
        for(String i :words){
            int len=i.length();
            int index=i.charAt(len-1)-'1';
            result[index]=i.substring(0,len-1);
        }
        String NewS="";
        for(int i=0;i<result.length;i++){
            NewS+=result[i];
            if(i<result.length-1){
                NewS+=" ";
            }
        }
        return NewS;
    }
}