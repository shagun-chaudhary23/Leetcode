class Solution {
    public boolean checkValidString(String s) {
        int minop=0;
        int maxop=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                minop++;
                maxop++;
            }
            else if(c==')'){
                minop--;
                maxop--;
            }
            else if(c=='*'){
                minop--;
                maxop++;
            }
            else{
                return false;
            }
            if(maxop < 0){
                return false;
            }
            if(minop <0){
                minop=0;
            }
        }
        return minop == 0;
    }
}