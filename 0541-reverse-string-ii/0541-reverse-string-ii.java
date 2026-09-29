class Solution {
    public String reverseStr(String s, int k) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i+=2*k){
            StringBuilder s1=new StringBuilder();
            StringBuilder s2=new StringBuilder();
            for(int j=i;j<Math.min(i + k, n);j++){
                s1.append(s.charAt(j));
            }
            for(int j=i+k;j<Math.min(i + 2 * k, n);j++){
                s2.append(s.charAt(j));
            }
            sb.append(s1.reverse());
            sb.append(s2);
        }
        return sb.toString();
    }
}