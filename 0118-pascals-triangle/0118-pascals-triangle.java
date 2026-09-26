class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal=new ArrayList<>();
        if(numRows==0){
            return pascal;
        }
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    int toAdd= ((pascal.get(i-1).get(j-1) )+ (pascal.get(i-1).get(j)));
                    row.add(toAdd);
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}