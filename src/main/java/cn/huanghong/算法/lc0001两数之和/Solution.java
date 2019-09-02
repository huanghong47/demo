package cn.huanghong.算法.lc0001两数之和;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-08-01 09:22
 */
public class Solution {
    public static void main(String[] args) {
        int [] result = {3,2,4};
        int [] result2 = twoSum(result,6);
        for (int i : result2) {
            System.out.println(i);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            int d = i+1;
            for(int j=d;j<nums.length;j++){
                int b = nums[j];
                int c = a + b;
                if(c==target){
                    result = new int[]{i,j};
                }
            }
        }
        return result;
    }
}
