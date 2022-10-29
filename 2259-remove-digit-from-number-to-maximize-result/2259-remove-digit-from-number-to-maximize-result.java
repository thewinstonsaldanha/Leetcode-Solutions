class Solution {
    public String removeDigit(String number, char digit) {
        int ind=-1;
        
        for(int i=0; i<number.length(); i++){
            if(number.charAt(i)== digit){
                ind=i;
                if(i<number.length()-1 && number.charAt(i+1)> digit){
                    break;
                }
            }
        }
        
        
            if(ind== number.length()-1){
                return number.substring(0, ind);
            } else return number.substring(0, ind)+ number.substring(ind+1); 
        
    }
}