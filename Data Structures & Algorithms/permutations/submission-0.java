class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        permutations(0,nums,result);
        return result; 
    }
    void permutations(int index,int nums[],List<List<Integer>> result){
        if(index==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int num:nums) list.add(num);
            result.add(list);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,i,index);
            permutations(index+1,nums,result);
            swap(nums,i,index);
        }

    }
    void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
