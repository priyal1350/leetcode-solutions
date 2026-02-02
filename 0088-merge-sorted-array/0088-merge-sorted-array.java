class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1=m;
        int n2=n;
        int L1[]=new int[n1];
        int R1[]=new int[n2];
        for(int i=0;i<n1;i++){
            L1[i]=nums1[i];
        }
         for(int j=0;j<n2;j++){
            R1[j]=nums2[j];
        }
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(L1[i]<R1[j])
            {nums1[k]=L1[i];
            i++;
            }
            else{
            nums1[k]=R1[j];
            j++; 
            }
            k++;
        }
        while(i<n1){
            nums1[k]=L1[i];
            i++;
            k++;
        }
        while(j<n2){
            nums1[k]=R1[j];
            j++;
            k++;
        } 
    }
}