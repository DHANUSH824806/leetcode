// LeetCode Problem:1
// It show the index number of the target 
//Give the sorted array 
import java.util.*;
class twosum {
    public static int[] twoSum(int[] nums, int target) {
      int i=0;
      int j=nums.length-1;
      while(i<j){
        
        ;
        if(nums[i]+nums[j]==target){
            return new int[]{i,j};
        }
        else if(nums[i]+nums[j]>target){
            j--;
        }
        else{
            i++;
        }
      }

      return new int[]{};

        
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target=13;
        int[] res=twoSum(nums,target);
        System.out.println(Arrays.toString(res));
        
    }
}
