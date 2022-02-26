package epam;

public class TwoSumEpam {

    public int[] twoSum(int[] nums, int sumOfTwo) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == sumOfTwo)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}
