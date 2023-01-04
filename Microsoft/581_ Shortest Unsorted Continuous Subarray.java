class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<nums.length-1 && nums[low]<=nums[low+1]){
            low++;
        }
        if(low==nums.length-1){
            return 0;
        }
        while(high>=0 && nums[high]>=nums[high-1]){
            high--;
        }
        int arraymax=Integer.MAX_VALUE;
        int arraymin=Integer.MIN_VALUE;
        for(int i=low;i<=high;i++){
            arraymax=Math.max(arraymax,nums[i]);
            arraymin=Math.min(arraymin,nums[i]);
        }
        while(low > 0 && nums[low-1]>arraymin){
            low--;
        }
        // System.out.print(low);
        while(high<nums.length-1 && nums[high+1]<arraymax){
            high++;
        }
        // System.out.print(high);
        return high-low+1;
    }
}