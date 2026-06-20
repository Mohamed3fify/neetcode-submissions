class Solution {
     public static int[] twoSum(int[] nums, int target) {
        Map<Integer  , Integer > map = new HashMap<>();
        int[] result = new int[2];
        int comp = 0 ;
        for (int i = 0; i < nums.length; i++){ // key : index & value is number
            map.put(nums[i], i );
            //map.put(i, nums[i]);


        }

//        for (int i = 0; i < map.size(); i++){
//             comp = target - nums[i];
//
//             if (map.containsValue(comp)){
//                  result = new int[]{nums[i] , comp};
//
//             }
//        } // in case output is value

        for (int i = 0; i < map.size(); i++){
             comp = target - nums[i];

             if (map.containsKey(comp)){
                 if (i != map.get(comp)) {
                     result = new int[]{i, map.get(comp)};

                     break;
                 }

             }
        } // in case output is key

        return result ;
    }
}
