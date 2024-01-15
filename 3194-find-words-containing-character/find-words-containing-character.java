class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i=0; i<words.length; i++){
            if(words[i].indexOf(x) >= 0){
                result.add(i);
            }
        }

        return result;
    }
}