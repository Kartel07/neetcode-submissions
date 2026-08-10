class Solution {
    public int maxArea(int[] heights) {
        int max = 0, l = 0, h = heights.length-1;
        while(l < h){
            if((h-l) * Math.min(heights[l],heights[h]) > max){
                max = (h-l) * Math.min(heights[l],heights[h]);
            }
            if(heights[l]  < heights[h]){
                l++;
            }
            else{
                h--;
            }
        }
        return max;

    }
}
