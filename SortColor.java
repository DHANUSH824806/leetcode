// This is Solution for LeetCode Problem 75 
class SortColor {
    static public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==0){
                nums[mid]=nums[low];
                nums[low]=0;
                low++;
                mid++;
            }
            else{
                nums[mid]=nums[high];
                nums[high]=2;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        sortColors(nums);
        for(int num:nums){
            System.out.print(num + " ");        
            }

    }
}