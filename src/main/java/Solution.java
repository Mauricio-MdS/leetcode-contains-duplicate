import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> distinctNumbers = new HashSet<>();

        for (int n : nums) {
            if (!distinctNumbers.add(n)) return true;
        }

        return false;
    }
}