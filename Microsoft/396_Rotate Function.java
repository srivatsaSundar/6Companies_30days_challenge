class Solution {
    public int maxRotateFunction(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        int max=0;
        int sumarray=0;
        int temp=0;
        int length=nums.length;
        for(int i=0;i<nums.length;i++){
            temp+= i*nums[i];
            sumarray+=nums[i];
        }
        max=temp;
        for(int j=nums.length-1;j>0;j--){
            temp=temp+sumarray-length*nums[j];
            if(temp>max){
                max=temp;
            }
        }
        return max;

    }
}