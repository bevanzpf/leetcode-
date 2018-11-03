import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {

    public static void main(String[] args) {

        boolean negative = false;
        Integer test = 1534236469;
        System.out.println(Integer.MAX_VALUE);
        //1534236469
        System.out.println(getOne(test, 0));

    }

    public int reverse(int x) {
        return getOne(x, 0);
    }

    public static int getOne(Integer a, Integer res){ //尾递归版本
        if ( a != 0 ) {
            Integer y = a % 10;
            if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && y > 7)) return 0;
            if(res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && y < -8)) return 0;
            res = res * 10 + y;
            return getOne((a / 10), res) ;
        }
        return res;
    }

}
