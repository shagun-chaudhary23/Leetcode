class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<Integer>  minrow= new ArrayList<>();
        ArrayList<Integer> maxcol = new ArrayList<>();
        for(int i=0;i<m;i++){
            int min=matrix[i][0];
            for(int j=0;j<n;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
            minrow.add(min);
        }
        for(int i=0;i<n;i++){
            int max=matrix[0][i];
            for(int j=0;j<m;j++){
                if(matrix[j][i]>max){
                    max=matrix[j][i];
                }
            }
            maxcol.add(max);
        }
        for(int a:minrow){
            if(maxcol.contains(a)){
                ans.add(a);
            }
        }
        return ans;
    }
}