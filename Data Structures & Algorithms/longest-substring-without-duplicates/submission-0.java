class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,max=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(hm.containsKey(ch)){
                left=Math.max(left,hm.get(ch)+1);
            }
            hm.put(ch,right);
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
