class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        Scanner sc= new Scanner(System.in);
        boolean check90 =true;
        boolean check0=true;
        boolean check180=true;
        boolean check270=true;
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] != target[i][j]){
                    check0=false;
                }
                if(mat[i][j]!=target[j][n-i-1]){
                    check90=false;
                }
                if(mat[i][j] != target[n-i-1][n-j-1]){
                    check180=false;
                }
                if(mat[i][j] != target[n-j-1][i]){
                    check270=false;
                }
            }
        }
        boolean ans= check0 || check90 ||check180||check270;
        return ans;
    }
}