import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #1 - Two Sum
 * Solución: HashMap para O(n)
 * Runtime: Beats 99.27%
 * Link: https://leetcode.com/problems/two-sum/
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapa = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int complemento = target - nums[i];
            
            if(mapa.containsKey(complemento)){
                return new int[]{mapa.get(complemento), i};
            }
            
            mapa.put(nums[i], i);
        }
        return new int[]{};
    }
}
