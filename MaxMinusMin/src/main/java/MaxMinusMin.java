
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int max = nums.get(0);
        int min = max;
        int test;
        for (int i = 1; i < nums.size(); i++){
            test = nums.get(i);
            if (test > max){max = test;}
            if (test < min){min = test;}
        }
        return max - min;
    }
}
