class Solution {
    public int scoreOfString(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            char ch2=s.charAt(i+1);
            int a1=(int)ch;
            int a2=(int)ch2;
            ans+=Math.abs(ch-ch2);
        }
        return ans;
    }
}