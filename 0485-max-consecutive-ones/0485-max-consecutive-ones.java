import java.util.*;
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len= nums.length;
        int conseOne=0;
        int countOne=0;
        for(int i=0;i<len;i++){
            if(nums[i]==1){
                countOne++;
            }
            conseOne=Math.max(conseOne, countOne);
            if(nums[i]==0){
                countOne=0;
            }
        }
        return conseOne;
    }
}