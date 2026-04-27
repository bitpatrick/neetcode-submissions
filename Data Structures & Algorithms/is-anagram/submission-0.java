class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length())
            return false;

        int[] letters = new int[26];
        Arrays.fill(letters, 0);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            letters[c - 'a'] += 1;
        }

        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            int qty = letters[c - 'a'];
            if (qty == 0) return false;
            letters[c - 'a'] -= 1;
        }

        return true;
    }
}
