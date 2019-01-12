/**
 * @author: nautilis
 **/
public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        String result = strs[0];

        for (String str : strs) {
            if(str.equals("")) {
                return "";
            }
            int index = 0;
            boolean different = false;
            for(int i =0; i < str.length() && i < result.length(); i++) {
                index = i;
                if(str.charAt(i) != result.charAt(i)) {
                    different = true;
                    break;
                }
            }
            if(result.length() == 0) {
                return "";
            }
            if(different) {
                result = result.substring(0,index);
            }
            if(index < result.length()) {
                result = result.substring(0,index + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LongestCommonPrefix14 test = new LongestCommonPrefix14();
//        String[] data = {"flower","flow","flight"};
        String[] data = {"flower","flow"};
//        String[] data = {"aa", "a"};
        String s = test.longestCommonPrefix(data);
        System.out.println(s);
    }
}
