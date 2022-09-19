class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finalList=new ArrayList();
        int n=nums.length;
        permuteHealper(0,nums,n,finalList);
        return finalList;
    }
    private void permuteHealper(int idx,int[] nums,int n,List<List<Integer>> finalList)
    {
        if(idx==n){
            storeArrayAsListInList(nums,finalList);
            return;
        }
        
        for(int i=idx;i<n;i++){
            swap(i,idx,nums);
            permuteHealper(idx+1,nums,n,finalList);
            swap(i,idx,nums);
        }
    } 
    
    private void swap(int idx1,int idx2,int[] nums){
        int temp=nums[idx1];
        nums[idx1]=nums[idx2];
        nums[idx2]=temp;
    }
    
    private void storeArrayAsListInList(int[] nums,List<List<Integer>> finalList )
    {
        ArrayList<Integer> list=new ArrayList();
        for(int ar:nums){
            list.add(ar);
        }
        finalList.add(list);
        return;
    }
}
// T : O(log n)
// Sp : O(n)