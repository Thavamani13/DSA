import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class P_TwoSumII {

    @Test
    public  void testcase1(){
        int[] nums = new int[]{2,7,11,15};
        int target =9;
        assertEquals(twoSum(nums,target),new int[]{1,2});
    }

    /*
    *
    *
    *
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
}
