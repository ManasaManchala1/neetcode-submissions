class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length,maxArea=0;
        Stack<Integer> st=new Stack<>();
        int left[]=new int[n], right[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();
            left[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();
            right[i]=st.isEmpty()?n:st.peek();
            st.push(i);
            maxArea=Math.max(maxArea,(right[i]-left[i]-1)*heights[i]);
        }
        return maxArea;
        
    }
}
