class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        generateParenthesis(n,0,0,"",result);
        return result;    
    }
    void generateParenthesis(int n,int open,int close,String str, List<String> result){
        if(open==n && close==n){
            result.add(str);
        }
        if(open<n) generateParenthesis(n,open+1,close,str+"(",result);
        if(close<open) generateParenthesis(n,open,close+1,str+")",result);
    }
}
