class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else{
                count = 0;
            }
            if(count > max){
                max = count;
            }

        }
        return Math.max(count, max);
    }
}