class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prods = new int[nums.length];
        prods[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prods[i] = prods[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for(int i = nums.length -1; i >= 0; i--){
            prods[i] = prods[i] * suffix;
            suffix *= nums[i];
        }
        return prods;
    }
}  
