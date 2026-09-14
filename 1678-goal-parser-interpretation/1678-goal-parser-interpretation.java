class Solution {
    public String interpret(String command) {
        // can use direct reolace funtion 
        // return command.replace("()","o").replace("(al)","al");
        int len=command.length();
        StringBuilder sb=new StringBuilder();
        char ch[]=command.toCharArray();
        int i=0;
        while(i<len){
            if(ch[i]=='G'){
                sb.append("G");
                i++;
            }
            else if(ch[i]=='(' && ch[i+1]==')'){
                sb.append("o");
                i+=2;
            }
            else{
                sb.append("al");
                i+=4;
            }
        }
        String str= sb.toString();
        return str;
    }
}