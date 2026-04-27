class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        
        Map<Integer, List<Integer>> indicesByValue = new HashMap<>();

        for (int j = 0; j < n; j++) {
            int value = nums[j];
            indicesByValue.computeIfAbsent(value, k -> new ArrayList<>()).add(j);
        }

        int[] pair = {};
        for (int i = 0; i < n; i++) {
            
            int comp = target - nums[i];
            
            if (!indicesByValue.containsKey(comp)) continue;

            List<Integer> indices = indicesByValue.get(comp);

            for (int j : indices) {
                if (i < j) {
                    pair = new int[] {i, j};
                    return pair;
                }
            }

        }

        return pair;
    }
}
