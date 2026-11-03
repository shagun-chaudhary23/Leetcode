class Solution {
    public int minMoves(int[] nums) {
        int result=0;
        int m=Arrays.stream(nums).max().getAsInt();
        for(int i=0;i<nums.length;i++){
            result+=(m-nums[i]);
        }
        return result;
    }
}