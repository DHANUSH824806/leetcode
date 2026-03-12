
import java.util.*;

// LeetCode Number :167
class twosumII {
    public static  int[] twoSum(int[] nums, int target) {
      int left=0;
      int right=nums.length-1;
      while(left<right){
        int sum=nums[left]+nums[right];
        if(sum==target){
            return new int[]{left+1,right+1};
        }
        else if(sum>target){
            right--;
        }
        else{
            left++;
        }
      }
      return new int[]{};

        
    }
    public static void main(String[] args) {
        // here you can give any numbers and target
        int[] numbers = {2,7,11,15};
        int target=9;
        int[] res=twoSum(numbers, target);
        System.out.print(Arrays.toString(res));

    }
}