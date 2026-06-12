class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] numsWithIndex = new int[nums.length][2]; 
        
        for (int i = 0; i < nums.length; i++) { 
            numsWithIndex[i][0] = nums[i];  
            numsWithIndex[i][1] = i;      
        } 
        
        // Fully qualified path avoids the 'import' compilation error
    Arrays.sort(numsWithIndex, (a, b) -> Integer.compare(a[0], b[0])); 
        
        int i = 0; 
        int j = nums.length - 1; 
        
        while (i < j) { 
            int ans = numsWithIndex[i][0] + numsWithIndex[j][0]; 
            
            if (ans == target) { 
                int index1 = numsWithIndex[i][1];
                int index2 = numsWithIndex[j][1];
                // Returns indices in ascending order
                return new int[] { Math.min(index1, index2), Math.max(index1, index2) }; 
            } else if (ans > target) { 
                j--; 
            } else { 
                i++; 
            } 
        } 
        
        return new int[] {};
    }
}
