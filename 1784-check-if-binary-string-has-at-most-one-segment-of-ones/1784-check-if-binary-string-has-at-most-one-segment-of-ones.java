class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.charAt(0)=='0'){
            return false;
        }
        boolean ans=true;
        int index=-1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='0'){
                index=i;
                break;
            }
        }
        if(index!=-1){
            for(int i=index;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    ans=false;
                    break;
                }
            }
        }
        return ans;
    }
}