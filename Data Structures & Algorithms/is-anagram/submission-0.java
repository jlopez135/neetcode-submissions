class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> string1 = new HashMap<>();
        HashMap<Character, Integer> string2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            if (!string1.containsKey(s.charAt(i))){
                string1.put(s.charAt(i), 1);
            }
            else{
                string1.put(s.charAt(i), string1.get(s.charAt(i)) + 1);
            }
            if (!string2.containsKey(t.charAt(i))){
                string2.put(t.charAt(i), 1);
            }
            else{
                string2.put(t.charAt(i), string2.get(t.charAt(i)) + 1);
            }
        }

        if (string1.equals(string2))
            return true;
        return false;
    }
}
