public class RegularExpression9 {

    public boolean isMatch(String s, String p) {
        if (p.length() == 0) {
            return s.length() == 0;
        }
        
        // p's length 1 is a special case
        if (p.length() == 1 || p.charAt(1) != '*') {
            if (s.length() < 1 || (p.charAt(0) != '.' && s.charAt(0) != p.charAt(0))) {
                return false;
            }
            return isMatch(s.substring(1), p.substring(1));
        } else {
            int len = s.length();
            int i = -1;
            while (i < len && (i < 0 || p.charAt(0) == '.' || p.charAt(0) == s.charAt(i))) {
                if (isMatch(s.substring(i + 1), p.substring(2))) {
                    return true;
                }
                i++;
            }
            return isMatch(s, p.substring(2));
        }
    }

    public static void main(String[] args) {
        RegularExpression9 solution = new RegularExpression9();
        String s = "aab";
        String p = "c*a*b";
        System.out.println(solution.isMatch(s, p)); // Output: true
    }
}
