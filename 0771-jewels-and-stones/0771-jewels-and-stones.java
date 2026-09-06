class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewel=new HashSet<>();
        for(char c:jewels.toCharArray()){
            jewel.add(c);
        }
        int count=0;
        for(char ch:stones.toCharArray()){
            if(jewel.contains(ch)){
                count++;
            }
        }
        return count;
    }
}