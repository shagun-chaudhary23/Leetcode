class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //approcah :- transpose then reverse each row one by one 
        // time =O(n^2) , Space=O(1)
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int val=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=val;
            }
        }
        for(int i=0;i<n;i++){ 
            for(int j=0;j<n/2;j++){ //if we will not use n/2 then the matrix will get back to original transpose one cause reversing will occur twice 
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
    }
}