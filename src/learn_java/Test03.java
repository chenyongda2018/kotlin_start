package learn_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        RandomizedCollection c = new RandomizedCollection();
        c.insert(1);
        c.remove(1);
        c.insert(1);
    }
}


//leetcode submit region begin(Prohibit modification and deletion)
class RandomizedCollection {
    /**
     * 添加时,
     */

    List<Integer> list;
    HashMap<Integer, HashSet<Integer>> idx;

    /**
     * Initialize your data structure here.
     */
    public RandomizedCollection() {
        list = new ArrayList<>();
        idx = new HashMap<Integer, HashSet<Integer>>();
    }

    /**
     * Inserts a value to the collection. Returns true if the collection did not already contain the specified element.
     */
    public boolean insert(int val) {
        list.add(val);
        HashSet<Integer> set;
        if (idx.containsKey(val)) {
            set = idx.get(val);
        } else {
            set = new HashSet<>();
        }
        set.add(list.size() - 1);
        idx.put(val,set);
        return set.size() == 1;
    }

    /**
     * Removes a value from the collection. Returns true if the collection contained the specified element.
     */
    public boolean remove(int val) {
        if(idx.containsKey(val)) {
            //将删除的元素与最后一个元素调换位置
            int lastNum = list.get(list.size()-1);

            HashSet<Integer> set = idx.get(val);
            int i = set.iterator().next();
            idx.get(lastNum).add(i);
            list.set(i,lastNum);

            idx.get(lastNum).remove(list.size()-1);

            list.remove(list.size()-1);
            return true;
        }
        return false;
    }

    /**
     * Get a random element from the collection.
     */
    public int getRandom() {
        return list.get((int) Math.random() * list.size());
    }

}
