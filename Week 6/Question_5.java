import java.util.HashMap;

public class Question_5 {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;
        if (s.length() == 0 && t.length() == 0)
            return true;
        
        HashMap<Character, Character> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2)
                    return false;
            } else {
                // Ensure one-to-one mapping
                if (map.containsValue(c2))
                    return false;
                map.put(c1, c2);
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Question_5 q5 = new Question_5();

        // Test cases
        System.out.println(q5.isIsomorphic("egg", "add")); // Output: true
        System.out.println(q5.isIsomorphic("foo", "bar")); // Output: false
    }
}
