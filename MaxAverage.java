//This is the solution for the problem 643
class MaxAverage {
    public static double findMaxAverage(int[] nums, int k) {
        int windowsum=0;
        for(int i=0 ; i<k ; i++){
            windowsum+=nums[i];
        }
        int max=windowsum;
        for(int j=k ; j<nums.length-1 ; j++){
            windowsum+=nums[j];
            windowsum-=nums[j-k];
                    max=Math.max(max,windowsum);


        }
        return (float) max/k;
        
    }
    public static void main(String[] args) {
        int[] nums={1,12,-5,-6,50,3};
        int k=4;
        System.out.print(findMaxAverage(nums,k));
    }
}