class Solution {
    public int maxDepth(String s) {
        int len=s.length();
        int maxDepth=0;
        int currentDepth=0;
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                currentDepth++;
                maxDepth=Math.max(currentDepth, maxDepth);
            }else{
                if(ch==')'){
                    currentDepth--;
                }
            }
        }
        return maxDepth;
    }
}