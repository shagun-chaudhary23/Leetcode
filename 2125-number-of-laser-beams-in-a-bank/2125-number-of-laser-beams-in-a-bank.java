class Solution {
    public int numberOfBeams(String[] bank) {
        int beams=0;
        int prevcount=0;
        for(String row :bank){
            int currcount=0;
            for(char c : row.toCharArray()){
                if(c =='1'){
                    currcount++;
                }
            }
            if(currcount>0){
                beams+= currcount*prevcount;
                prevcount=currcount;
            }
        }
        return beams;
    }
}