import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {

    public static void main(String[] args) {

        boolean negative = false;
        Integer test = 534236469;
        Long start = System.currentTimeMillis();
        //System.out.println(Integer.MAX_VALUE);
        //System.out.println(reverse(test));
        System.out.println(getOne(test, 0));
        System.out.println(System.currentTimeMillis() - start );

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

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

}
