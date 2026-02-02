class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int prefixsum=0;
        for(int i=0;i<nums.length;i++){
            prefixsum=prefixsum+nums[i];
            max=Math.max(max,prefixsum);
            if(prefixsum<0){
                prefixsum=0;
            }

        }
        return max;
    }
}