import java.util.*;
class Solution {
    public int minimumDeletions(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int maxIndex=0;
        int minIndex=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
        }
        int a=Math.max(minIndex,maxIndex);
        int b=Math.min(minIndex,maxIndex);
        
        int fromLeft=a+1;
        int fromRight=n-b;
        int fromBoth=(b+1)+(n-a);

        return Math.min(fromBoth,Math.min(fromLeft, fromRight));
    }
}