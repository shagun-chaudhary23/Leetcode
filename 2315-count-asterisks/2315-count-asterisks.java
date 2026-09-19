class Solution {
    public int countAsterisks(String s) {
        int count=0;
        boolean inpair=false;
        for(char c: s.toCharArray()){
            if(c=='|'){
                inpair=!inpair;
            }
            else if((c=='*') && (!inpair)){
                count++;
            }
        }
        return count;
    }
}