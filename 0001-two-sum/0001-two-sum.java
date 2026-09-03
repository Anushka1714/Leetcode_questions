// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i = 0;i<=nums.length;i++){
//             int sum = nums[i] + nums[i+1];
//             if (sum == target){
//                 return num[i],nums[i+1];
//             }
//         }
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
           
        //    Arrays.sort(nums);

        //    int i=0,j=nums.length-1;
        //    while(i<j){
        //     int sum = nums[i]+nums[j];

        //     if(sum==target){
        //         return new int[]{i,j};
        //     }
        //     else if(sum< target){
        //         i++;
        //     }
        //     else{
        //         j--;
        //    }
        //    }
        //    return new int[]{-1,-1};
           }
    }