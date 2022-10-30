class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> counts= new HashMap<>();
        
        for(char c: magazine.toCharArray()){
            counts.put(c, counts.getOrDefault(c, 0)+1); //put c with the number
        }
        
        
        for(char c: ransomNote.toCharArray()){
            if(!counts.containsKey(c)|| counts.get(c)<=0){
                return false;
            }
            else
                counts.put(c, counts.get(c)-1);
        }
        return true;
        
    }
}