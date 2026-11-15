class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> subList=new ArrayList<>();
        subsets(0,nums,subList,result);
        return result;
    }
    void subsets(int index,int nums[],List<Integer> subList,List<List<Integer>> result){
        if(index>=nums.length){
            result.add(new ArrayList<>(subList));
            return;
        }
        subList.add(nums[index]);
        subsets(index+1,nums,subList,result);
        subList.remove(subList.size()-1);
        subsets(index+1,nums,subList,result);
    }
}
