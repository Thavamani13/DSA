import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class P_TwoSumII {

    @Test
    public  void testcase1(){
        int[] nums = new int[]{2,7,11,15};
        int target =9;
        assertEquals(twoSum(nums,target),new int[]{1,2});
    }

    @Test
    public  void testcase2(){
        int[] nums = new int[]{2,7,11,15};
        int target =9;
        assertEquals(twoSumTwoPointers(nums,target),new int[]{1,2});
    }



    /*Since the inputs are sorted
    *The outer for loop can be defined as constent
    *    inner loop will traverse through the array and find the targte(left+rightval==target) return indeces
    *    Since it is based index , return indeces+1
    * defaul return {-1,-1}
    *
    *Time - O(n2) , Space - O(1)
    * */
    private int[] twoSum(int[] nums, int target) {

        for (int i = 0; i <nums.length-1 ; i++) {
            int leftVal = nums[i];

            for (int j = i+1; j < nums.length; j++) {
                int rightVal = nums[j];
                if(leftVal+rightVal==target) return new int[]{i+1,j+1};
            }
        }

        return new int[]{-1,-1};
    }


    /*Since the inputs are sorted
    * keep two pointers , left and right extreeme
    * Aadd both val => left + right == target return {leftindex+, right index+}
    * Add both Val < target ==>increment left pointer
    * Add both Val > target ==>decrement right pointer
    * Continute till leftpointer==right pointer , return -1,-1 by default
    * TC - O(n)
    * SC - O(1)
    * */
    private int[] twoSumTwoPointers(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<right){
            int leftVal = nums[left];
            int rightVal = nums[right];

            if(leftVal+rightVal<target){
                left++;
            }

            else if(leftVal+rightVal>target){
                right--;
            }

            else {
                return new int[]{left+1,right+1};
            }
        }

        return new int[]{-1,-1};
    }
}
