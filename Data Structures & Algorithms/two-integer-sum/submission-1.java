class Solution {
    public static int[] twoSum(int[] nums, int target) {
        if(nums.length == 2){
            return new int[]{0,1};
        }
        int[] arr = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i],i);
        }
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(hm.containsKey(diff) && hm.get(diff)!= i){
                arr[0] = i;
                arr[1] = hm.get(diff);
                break;
            }
        }
            return arr;
    }
}