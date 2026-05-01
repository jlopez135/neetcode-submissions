class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> checkDuplicates = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (!checkDuplicates.contains(nums[i])){
                checkDuplicates.add(nums[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }
}