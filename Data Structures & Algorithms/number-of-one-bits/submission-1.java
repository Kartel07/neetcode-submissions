class Solution {
    public int hammingWeight(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int res = 1;
        while(n / 2 != 0){
            if(n%2 == 1){
                res++;
            }
            n = n/2;
        }
        return res;
    }
}
