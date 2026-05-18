//https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public int removeDuplicates(int[] nums) {

        int i =0,j=1;

        while (j < nums.length) {

            if(nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
            j++;

        }
        return i+1;
    }
}