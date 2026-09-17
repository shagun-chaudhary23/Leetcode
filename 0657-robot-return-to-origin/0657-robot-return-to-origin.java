class Solution {
    public boolean judgeCircle(String moves) {
        int cU=0;
        int cD=0;
        int cR=0;
        int cL=0;
        for(char s: moves.toCharArray()){
            if(s == 'U'){
                cU++;
            }
            if(s == 'D'){
                cD++;
            }
            if(s == 'L'){
                cL++;
            }
            if(s == 'R'){
                cR++;
            }
        }
        return (cU==cD) && (cR==cL);
    }
}