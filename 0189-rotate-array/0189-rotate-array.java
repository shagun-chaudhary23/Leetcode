class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            if(i<k){
                temp[i]=nums[n-k+i];
            }else{
                temp[i]=nums[i-k];
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
    }
}