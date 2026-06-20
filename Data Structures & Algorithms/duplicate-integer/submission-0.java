class Solution {
    public boolean hasDuplicate(int[] nums) {
         int flag  = 0;
        for (int  i = 1; i < nums.length; i++){
            for (int j = 0; j < i; j++){
                if (nums[j] == nums[i]) {
                    flag = 1;
                    break;

                }
            }
        }
        return flag == 1;
    }
}