import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

public class P01_TwoSum {

    @Test
    public  void testcase1(){
        int[] nums = new int[]{2,7,11,15};
        int target =9;
        assertEquals(twoSum(nums,target),new int[]{0,1});
    }

    @Test
    public  void testcase2(){
        int[] nums = new int[]{2,7,11,15};
        int target =9;
        assertEquals(twoSumOptimized(nums,target),new int[]{0,1});
    }




    //Time - O(n2)  , space - O(1)


    private int[] twoSum(int[] nums, int target) {

        for (int i = 0; i <nums.length-1 ; i++) {
            int leftVal = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int rightVal=nums[j];
                if(i!=j && leftVal+rightVal==target){
                    return new int[]{i,j};
                }

            }
        }

        return new int[]{-1,-1};
    }

  /* // Since  the return output is index , sorting is not a good option
  Define a map
  Traverse through the array find the difference[target-inputval] . Tracck it in map .
  Difference as KEY and index as VALUE
  if Difference is not available in map , ADD it to the map
  else return the {index of the DIFFERENCE , current INDEX}

  TIME - O(n)

  SPACE -O(n)

    */
    private int[] twoSumOptimized(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap();

        for (int i = 0; i < nums.length ; i++) {
            int inputVal = nums[i];
            int difference = target-inputVal;

            if(!map.containsKey(difference)){
                map.put(inputVal,i);
            }
            else {
                int indexVal = map.get(difference);
                return new int[]{indexVal,i};
            }

        }

        return new int[]{-1,1};
    }



}
