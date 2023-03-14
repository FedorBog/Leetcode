import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = new int[]{3,3};
        int target = 6;

        System.out.println(Arrays.toString(solution(nums, target)));

    }
    public static int[] solution(int[] nums, int target) {

        int[] result = new int[2];
        Map<Integer, Integer> numExist = new HashMap<>();

        int missAdd = 0;

        for (int i = 0; i < nums.length; i++){

            missAdd = target - nums[i];

            if ( numExist.containsKey(missAdd) ){
                result[0] = numExist.get(missAdd);
                result[1] = i;
                break;
            }
            numExist.put(nums[i], i);
        }
        return result;
    }

}
