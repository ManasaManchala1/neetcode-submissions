class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1,right=0,n=piles.length;
        for(int i=0;i<n;i++) right=Math.max(right,piles[i]);
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            int hours=0;
            for(int i=0;i<n;i++) hours+=Math.ceil((double)piles[i]/mid);
            if(hours<=h){
                ans=Math.min(ans,mid);
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
        
    }
}
