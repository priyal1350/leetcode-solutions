class Solution {
    public void moveZeroes(int[] nums) {
        int j=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
                //count++;
            }
        }
            for(int k=j;k<nums.length;k++){
                nums[k]=0;
            }
    }
}
