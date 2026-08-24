class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int left[]=new int[k];
        int right[]=new int[n-k];
        for(int i=0;i<k;i++){
            left[i]= nums[n-k+i];
        }
        for(int i=0;i<n-k;i++){
            right[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            if(i<k){
                nums[i]=left[i];
            }else{
                nums[i]=right[i-k];
            }
        }
        
    }
}