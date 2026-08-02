class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm =  new HashMap<>();
        for (int num : nums) {
            hm.merge(num, 1, Integer::sum);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        
        for (int key : hm.keySet()) {
            int frequency = hm.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] result = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[index++] = num;
                    if (index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
