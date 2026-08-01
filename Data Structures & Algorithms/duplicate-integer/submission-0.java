class Solution {
    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            arr.add(nums[i]);
        }
        ArrayList<Integer> al = new ArrayList<>(arr);
        if(nums.length == al.size()){
            return false;
        }
        return true;
    }
}