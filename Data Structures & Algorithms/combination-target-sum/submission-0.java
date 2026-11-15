class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> subList=new ArrayList<>();
        combinationSum(0,nums,target,subList,result);
        return result;
    }
    void combinationSum(int index,int[] nums,int target,List<Integer> subList,List<List<Integer>> result){
        if(target<=0 || index>=nums.length){
            if(target==0) result.add(new ArrayList<>(subList));
            return;
        }
        subList.add(nums[index]);
        combinationSum(index,nums,target-nums[index],subList,result);
        subList.remove(subList.size()-1);
        combinationSum(index+1,nums,target,subList,result);
    }
}
