class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length,i=0,j=0,k=0;
        int nums[]=new int[n+m];
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                nums[k++]=nums1[i++];
            }else{
                nums[k++]=nums2[j++];
            }
        }
        while(i<n){
            nums[k++]=nums1[i++];
        }
        while(j<m){
            nums[k++]=nums2[j++];
        }
        int mid=(n+m)/2,total=n+m;
        double median=0;
        if(total%2==0){
            median=(nums[mid]+nums[mid-1])/2.0;
        }else{
            median=nums[mid];
        }
        return median;
        
    }
}
