package main.java.com.gtr3ase.tsum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tsum {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> hmap =  new HashMap<>();

        int target_minus_i = 0;
        for(int i = 0; i < nums.length; i++){
            target_minus_i = target - nums[i];
            if(hmap.containsKey(target_minus_i)){
                return new int[] {i, hmap.get(target_minus_i)};
            }
            else{
                hmap.put(nums[i], i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 18;

        Tsum ts = new Tsum();
        System.out.println(Arrays.toString(ts.twoSum(nums, target)));
    }
}
