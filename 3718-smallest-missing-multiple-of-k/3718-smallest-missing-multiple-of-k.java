class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> mult=new HashSet<>();
        for(int i:nums){
            mult.add(i);
        }
        int multiple=k;
        while(mult.contains(multiple)){
            multiple+=k;
        }
        return multiple;
    }
}