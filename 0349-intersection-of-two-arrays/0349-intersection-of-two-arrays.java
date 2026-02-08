class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        for(int n:nums1){
            set1.add(n);
        }
         Set<Integer>commonset=new HashSet<>();
         for(int n:nums2){
            if (set1.contains(n)){
                commonset.add(n);
            }
         }
         int[] ans = new int[commonset.size()];
         int i=0;
         for(int n:commonset){
           ans[i]=n;
           i++;
         }
    return ans;
    }
}