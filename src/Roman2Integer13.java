import java.util.HashMap;
import java.util.Map;

/**
 * @author: nautilis
 **/
public class Roman2Integer13 {

    /**
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     */

    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        String[] splits = s.split("");
        int result = 0;
        for(int i=0; i < splits.length; i++) {
            if (i + 1 < splits.length && map.get(splits[i] + splits[i+1]) != null) {
                result += map.get(splits[i] + splits[i+1]);
                i++;
                continue;
            }
            result += map.get(splits[i]);

        }
        return result;

    }

    public static void main(String[] args) {
        Roman2Integer13 test = new Roman2Integer13();
        System.out.println(test.romanToInt("IV"));
    }


}
