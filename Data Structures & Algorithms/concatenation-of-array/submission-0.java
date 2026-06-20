class Solution {
    public int[] getConcatenation(int[] nums) {
        //nums = new int[]{1, 2, 3, 4};

        int ansLen =  (nums.length) * 2 ;
        int[] ans = new int[ansLen];
        int j = 0;
        for (int i = 0; i < ansLen  ; i++){

            ans[i] = nums[j];
            j++;
            if (j == nums.length ) j = 0;
        }
        return ans;
        
    }
}