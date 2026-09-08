class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix=new int[m][n];
        for(int[] index:indices){
            int r= index[0];
            int c= index[1];
            for(int i=0;i<n;i++){
                matrix[r][i]+=1;
            }
            for(int j=0;j<m;j++){
                matrix[j][c]+=1;
            }
        }
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]%2!=0){
                    c++;
                }
            }
        }
        return c;
    }
}