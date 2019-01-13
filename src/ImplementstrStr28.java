/**
 * @author: nautilis
 **/
public class ImplementstrStr28 {
    //https://www.cnblogs.com/golove/p/3234673.html
    public int strStr(String s, String t)
    {
        if(s.length() < t.length())
            return -1;

        int BASE = 26, sHash = 0, tHash = 0, powerT = 1;
        int n = s.length();
        int m = t.length();

        for(int i = 0; i < m; i++)
        {
            powerT = i > 0 ? powerT * BASE : 1;
            sHash = sHash * BASE + s.charAt(i);
            tHash = tHash * BASE + t.charAt(i);
        }

        for(int i = m; i < n; i++)
        {
            if(sHash == tHash && s.substring(i - m, i).equals(t))
            {
                return i - m;
            }
            sHash = sHash - s.charAt(i - m) * powerT;
            sHash = sHash * BASE + s.charAt(i);
        }

        if(sHash == tHash && s.substring(n - m).equals(t))
        {
            return n - m;
        }
        return -1;
    }
}
