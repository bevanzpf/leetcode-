import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: nautilis
 **/
public class ThreeSum15 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<= nums.length - 2; i++) {
            if(i > 0 && nums[i-1] == nums[i]){
                continue;
            }

            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end]; /*如果i下标下的值跟之前相同不用再计算*/
                if (sum == 0) {
                    Integer[] result = {nums[i], nums[start], nums[end]};
                    List<Integer> resList = Arrays.asList(result);
                    res.add(resList);
                    while (start < end && nums[start] == nums[start+1]) {/*如果已经是解，过滤相同的解*/
                        start++;
                    }
                    while (start < end && nums[end] == nums[end-1]) {
                        end--;
                    }
                    /*前后下标都移动*/
                    start++;
                    end--;
                }else if (sum < 0) { /*只需往增加的一边靠*/
                    start++;
                } else { /*往减小的一边靠*/
                    end--;
                }
            }
        }
        return res;
    }

}
