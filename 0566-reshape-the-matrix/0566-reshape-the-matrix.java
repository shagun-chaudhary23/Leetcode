class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int arr[]=new int[m*n];
        int index=0;
        if(m*n != c*r){
            return mat;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[index]=mat[i][j];
                index++;
            }
        }
        int newMat[][]=new int[r][c];
        int indexx=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                newMat[i][j]=arr[indexx];
                indexx++;
            }
        }
        return newMat;
    }
}