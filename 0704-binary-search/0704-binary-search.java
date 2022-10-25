class Solution {
    public int search(int[] nums, int target) {
        int l = -1, r = nums.length;
        while (r - l > 1) {
            int mid = (l + r) >> 1;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) r = mid;
            else l = mid;
        }
        return -1;
    }
}