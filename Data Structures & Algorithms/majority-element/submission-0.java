class Solution {
    public int majorityElement(int[] nums) {
        double appearance = Math.floor(nums.length/2), maj = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
         for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > appearance){
                maj = entry.getKey();
            }
        }
        return (int)maj;
    }
}