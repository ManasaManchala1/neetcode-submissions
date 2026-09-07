class Solution {
    public String minWindow(String s, String t) {
        int n=s.length(),m=t.length(),left=0,right=0,minLength=Integer.MAX_VALUE,count=0,startIndex=-1;
        int hash[]=new int[128];
        for(int i=0;i<m;i++) hash[t.charAt(i)]++;
        while(right<n){
            char ch=s.charAt(right);
            if(hash[ch]>0) count++;
            hash[ch]--;
            while(count==m){
                if(right-left+1<minLength){
                    minLength=right-left+1;
                    startIndex=left;
                }
                char leftChar=s.charAt(left);
                hash[leftChar]++;
                if(hash[leftChar]>0) count--;
                left++;
            }
            right++;
        }
        return startIndex==-1?"":s.substring(startIndex,startIndex+minLength);
        
    }
}
