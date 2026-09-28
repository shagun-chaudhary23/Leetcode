class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        for(int k=0; k<list.size();k+=2 ){
            int r=list.get(k);
            int c=list.get(k+1);
            for (int j = 0; j < n; j++) {
                matrix[r][j] = 0;
            }
            for (int i = 0; i < m; i++) {
                matrix[i][c] = 0;
            }
        }
    }

}