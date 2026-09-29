class Solution {
    public int[] replaceElements(int[] arr) {
        int max = 0, n = arr.length-1, smax = 0;
        max = arr[n];
        arr[n] = -1;
        for(int i = n-1; i >= 0; i--){
            smax = arr[i];
            arr[i] = max;
            max = Math.max(smax, max);
        }
        return arr;
    }
}