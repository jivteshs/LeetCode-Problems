class Solution {
    public int[] twoSum(int[] nums, int target) {

        int index = 0;
        boolean found = false;
        int[] indexes = new int[2];
        for(int i = 0; i < nums.length - 1 ; i++) {
            int sum = 0;
            indexes[0] = i;
            sum += nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                int sum2 = 0;
                indexes[1] = j;
                sum2 += nums[j];
                if((sum + sum2) == target) {
                    found = true;
                    break;
                }                
            }
            if(found)
            {
                break;
            } 
        }
        return indexes;
    }
}