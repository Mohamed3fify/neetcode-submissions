class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) return false;
        char[] s1 = new char[s.length()];
        char[] t1 = new char[t.length()];
        for (int i = 0 ; i < s.length() ; i++){
             s1[i] = s.charAt(i);
        }
        for (int i = 0 ; i < t.length() ; i++){
            t1[i] = t.charAt(i);
        }
        Arrays.sort(s1); Arrays.sort(t1);
        for (int i = 0; i < s1.length; i++){
            if (s1[i] != t1[i]) return false;
        }
        return true;
    }
}
