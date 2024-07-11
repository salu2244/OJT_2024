
import java.util.HashMap;
import java.util.Map;

public class Question_6 {

    public static boolean areIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Character> sToTMap = new HashMap<>();
        Map<Character, Character> tToSMap = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            // Check mapping from sChar to tChar
            if (sToTMap.containsKey(sChar)) {
                if (sToTMap.get(sChar) != tChar) {
                    return false; // Mismatch found
                }
            } else {
                sToTMap.put(sChar, tChar);
            }
            
            // Check mapping from tChar to sChar
            if (tToSMap.containsKey(tChar)) {
                if (tToSMap.get(tChar) != sChar) {
                    return false; // Mismatch found
                }
            } else {
                tToSMap.put(tChar, sChar);
            }
        }
        
        return true; // No mismatches found
    }

    public static void main(String[] args) {
        // Example usage:
        String s1 = "egg";
        String t1 = "add";
        System.out.println(areIsomorphic(s1, t1)); // Output: true
        
        String s2 = "foo";
        String t2 = "bar";
        System.out.println(areIsomorphic(s2, t2)); // Output: false
    }
}
