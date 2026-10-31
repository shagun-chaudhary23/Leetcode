class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
        int index=0;
        for(int i=0;i<n/2;i++){
            result[index++]=pos.get(i);
            result[index++]=neg.get(i);
        }
        return result;
    }
}