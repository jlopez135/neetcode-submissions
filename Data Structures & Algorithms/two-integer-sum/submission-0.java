class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0, 0};
        boolean stop = false;
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    stop = true;
                }
                if (stop)
                    break;
            }
            if (stop)
                break;
        }
        return result;
    }
}
