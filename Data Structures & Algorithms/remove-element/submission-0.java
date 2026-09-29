class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0, n = nums.length, i = 0;
        while(i < n){
            if(nums[i]== val){
                nums[i] = nums[--n];
            }
            else{
                i++;
            }
        }
        return n;
    }
}