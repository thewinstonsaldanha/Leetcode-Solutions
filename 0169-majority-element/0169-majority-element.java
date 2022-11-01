class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        
        HashMap <Integer, Integer> maps= new HashMap<>();
        for(int i: nums){
            if(maps.containsKey(i)  &&   maps.get(i)+1> nums.length/2 ){
                return i;
            }
            else{
                maps.put(i, maps.getOrDefault(i, 0)+1);
            }
        }
        return -1;
    }
}