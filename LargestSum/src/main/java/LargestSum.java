
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int bigNum;
        int secondNum;
        if (nums.size() < 1){return 0;}
        if (nums.size() == 1){return nums.get(0);}
        if (nums.get(0) > nums.get(1)){
            bigNum = nums.get(0);
            secondNum = nums.get(1);
        } else {
            bigNum = nums.get(1);
            secondNum = nums.get(0);
        }
        for (int i = 2; i < nums.size(); i++){
            int num = nums.get(i);
            if (num > secondNum){
                if (num > bigNum){
                    secondNum = bigNum;
                    bigNum = num;
                } else {
                    secondNum = num;
                }
            }
        }
        return bigNum + secondNum;
    }
}