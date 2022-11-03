class Solution {
    public int longestPalindrome(String[] words) {
        int result=0;
        int freq[][]= new int [26][26];  //initialized array
        
        for(String s: words){
            int i= s.charAt(0)- 'a';  //extracted first element
            int j= s.charAt(1)- 'a';  //extracted second element
            if(freq[j][i]> 0){        //if multiples are found so they are palindrome
                result= result+4;     // if found then add 4
                freq[j][i]--;         //keep only one discard the other
            }
            else{
            freq[i][j]++;            //else keep a count
            }
        }
        
        
        for(int i=0; i<26; i++){
            if(freq[i][i]>0){        //if similar alphabets in word are found e.g. gg
                result= result+2;    // add their result to 2
                break;               // break then 
            }
            
        }
        return result;
        
    }
}