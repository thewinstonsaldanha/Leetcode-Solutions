class Solution {
    public int longestPalindrome(String[] words) {
        
        int result=0;
        int freq[][]= new int[26][26];
        
        for(String s: words){
            int i= s.charAt(0)-'a';
            int j= s.charAt(1)-'a';
            if(freq[j][i]>0){
                result= result+4;
                freq[j][i]--;
            } else{
            freq[i][j]++;        }
         }
        
        
        
        for(int i=0; i<26; i++){
            if(freq[i][i]>0){
                result= result+2;
                break;
            }
        }
        
        return result;
        
        
    }
}