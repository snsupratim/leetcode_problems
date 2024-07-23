// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array
//   such that nums[i] == nums[j] and abs(i - j) <= k..

class ContainsDuplicatesII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if(map.containsKey(current) && i - map.get(current) <= k) {
                return true;
            } else {
                map.put(current, i);
            }
        }
        
        return false;
    }
}
