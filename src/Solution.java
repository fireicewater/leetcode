import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/28.
 */
public class Solution{

    /**
     *
     * 1. Two Sum Add to List QuestionEditorial Solution My Submissions
     * Total Accepted: 382115
     * Total Submissions: 1292842
     * Difficulty: Easy
     * Contributors: Admin
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * 
     * You may assume that each input would have exactly one solution.
     * 
     * Example:
     * Given nums = [2, 7, 11, 15], target = 9,
     * 
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     * 
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums,int target){
        for (int i = 0; i < nums.length - 1; i++){
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++){
                int num1 = nums[j];
                if (num1 + num == target){
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    /**
     *
     * 
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums,int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i ;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i );
        }
        return result;
    }

}
