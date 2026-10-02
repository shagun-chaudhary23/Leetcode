class Solution {
    public int maxDistinct(String s) {
        ArrayList<Character> list=new ArrayList<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(list.contains(ch)==false){
                count++;
                list.add(ch);
            }
        }
        return count;
    }
}