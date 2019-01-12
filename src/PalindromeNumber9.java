/**
 * @author: nautilis
 **/
public class PalindromeNumber9 {

    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertNum = 0;
        while (x > revertNum) {
            revertNum = revertNum * 10 + x % 10;
            x /= 10;
        }

        if(x== revertNum || x== revertNum / 10) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        PalindromeNumber9 test = new PalindromeNumber9();
        System.out.println(test.isPalindrome(1020)); //false
        System.out.println(test.isPalindrome(10101)); //true
        System.out.println(test.isPalindrome(10201)); //true
        System.out.println(test.isPalindrome(1034)); // false
        System.out.println(test.isPalindrome(10201)); // true
    }



}
