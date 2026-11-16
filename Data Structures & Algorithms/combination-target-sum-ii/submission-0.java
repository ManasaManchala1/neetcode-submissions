class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> subList=new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2(0,candidates,target,subList,result);
        return result;
        
    }
    void combinationSum2(int index,int candidates[],int target,List<Integer> subList, List<List<Integer>> result){
        if(target<=0){
            if(target==0) result.add(new ArrayList<>(subList));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;
            subList.add(candidates[i]);
            combinationSum2(i+1,candidates,target-candidates[i],subList,result);
            subList.remove(subList.size()-1);

        }
    }
}
