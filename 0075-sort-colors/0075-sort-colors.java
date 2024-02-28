class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int mid=0;
        int end=nums.length-1;
        while(mid<=end){
            if(nums[mid]==0){
             int temp=nums[start];
             nums[start]=nums[mid];
             nums[mid]=temp;
                start++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
             int t=nums[end];
             nums[end]=nums[mid];
             nums[mid]=t;
                end--;
            }
        }
    }
}