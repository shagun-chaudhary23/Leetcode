class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> unique=new HashSet<>();
        for(int num:nums1){
            unique.add(num);
        }
        HashSet<Integer> intersect =new HashSet<>();
        for(int num:nums2){
            if(unique.contains(num)){
                intersect.add(num);
            }
        }
        int s=intersect.size();
        int index=0;
        int result[]=new int[s];
        for(int num:intersect){
            result[index]=num;
            index++;
        }
        return result;
    }
}