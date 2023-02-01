import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        Set<Integer> num = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (!(num.add(Integer.valueOf(nums[i])))){
                return true;
            };
        }
        return false;
    }
}
