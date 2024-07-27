// Implement the RandomizedSet class:

// RandomizedSet() Initializes the RandomizedSet object.
// bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
// bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
// int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
// You must implement the functions of the class such that each function works in average O(1) time complexity

class RandomizedSet {
     HashMap<Integer, Integer> map;
    ArrayList<Integer> values;


    public RandomizedSet() {
         map = new HashMap<Integer, Integer>();
        values = new ArrayList<Integer>();
    }
    
    public boolean insert(int val) {
         if(!map.containsKey(val)) {
            map.put(val, val);
            values.add(val);
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean remove(int val) {
         if(map.containsKey(val)) {
            map.remove(val);
            values.remove(values.indexOf(val));
            return true;
        }
        return false;
    }
    
    public int getRandom() {
          int random = (int)(Math.random() * values.size());
        int valueToReturn = values.get(random);
        return map.get(valueToReturn);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
