class Solution {
    public boolean hasDuplicate(int[] nums) {
         Set<Integer> arr = new HashSet<>();


        int flag  = 0;
        for (int num : nums) {
            if (arr.contains(num)) {
                flag = 1;
                break;
            }
            arr.add(num);

        }
        return flag == 1;
    }
}