class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        
Integer event1_0 = Integer.valueOf(event1[0].replace(":", ""));
    Integer event1_1 = Integer.valueOf(event1[1].replace(":", ""));
    Integer event2_0 = Integer.parseInt(event2[0].replace(":", ""));
    Integer event2_1 = Integer.parseInt(event2[1].replace(":", ""));
    
    if (event2_1 < event1_0) return false;
    if (event1_1 >= event2_0) return true;
    
    return false;
        
        
        
    }
}