class Solution {

    public boolean containsDuplicate(int[] nums) {
        // int pointerOne = 0;
        // int pointerTwo = nums.length - 1;

        // while(pointerOne < nums.length && pointerTwo >= 0) {
        //     int i = pointerOne + 1;
        //     int j = pointerTwo - 1;
        //     while(i < j) {
        //      if(nums[pointerOne] == nums[i]  || nums[pointerTwo] == nums[j] || nums[pointerOne] == nums[j] || nums[pointerTwo] == nums[i]) {
        //         return true;
        //      }
        //      i++;
        //      j--;
        //     }
        //     pointerOne++;
        //     pointerTwo--;
        // }

        // return false;



        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i+1; j < nums.length; j++ ) {
        //         if(nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) {
            if(set.contains(n)) {
                return true;
            }
            else {
                set.add(n);
            }
        }

        return false;
    }
}