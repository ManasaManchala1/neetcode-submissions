class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,maxFreq=0,maxLength=0;
        int freq[]=new int[26];
        for(int right=0;right<s.length();right++){
            int index=s.charAt(right)-'A';
            freq[index]++;
            maxFreq=Math.max(maxFreq,freq[index]);
            if((right-left+1)-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
        
    }
}
