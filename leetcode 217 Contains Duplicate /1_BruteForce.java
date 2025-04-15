class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        boolean dupF = false;
        for (int i = 0; i < n; i++) {                                     
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    dupF = true;
                    break;
                }
            }
            if (dupF)
                break;
        }
        return dupF;
    }

}

// complexity o(N^2) 