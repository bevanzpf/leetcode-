import java.util.ArrayList;
import java.util.List;

/**
 * @author: nautilis
 **/
public class SelfDividingNumber728 {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i % 10 == 0) {
                continue;
            }
            boolean can = true;
            int y = i;
            while (y > 0) {
                int mod = y % 10;
                if (mod == 0 || (i % mod) != 0) {
                    can = false;
                    break;
                }
                y /= 10;
            }
            if (can) {
                list.add(i);
            }
        }
        return list;
    }
}
