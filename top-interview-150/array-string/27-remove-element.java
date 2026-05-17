//https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public int removeElement(int[] nums, int val) {

        int i = 0;
        int j = nums.length-1;
        int k = 0;

        while (i < j) {
            if (nums[i] == val) {
                if(nums[i] == nums[j]) {
                    j--;
                    continue;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
            i++;
        }

        for(int l =0; l<nums.length; l++){
            if(nums[l] != val) {
                ++k;
            } else {
                break;
            }
        }
        
        return k;
    }
}