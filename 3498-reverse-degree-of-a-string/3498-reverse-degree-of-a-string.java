class Solution {
    public int reverseDegree(String s) {
        int len =s.length();
        int sum=0;
        for(int i=0;i<len;i++){
            int product=(26-(s.charAt(i)-'a'))*(i+1);
            sum+=product;
        }
        return sum;
    }
}