class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(s.contains(String.valueOf(x))){
                list.add(i);
            }
        }
        return list;
    }
}