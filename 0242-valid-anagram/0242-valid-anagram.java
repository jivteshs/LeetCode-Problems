class Solution {
    public boolean isAnagram(String s, String t) {

        //Original Array Solution
        if(s.length() != t.length()) {
            return false;
        }


        int[] first = new int[128];
        int[] second = new int[128];
        for(int i = 0; i < s.length(); i++) {
            first[s.charAt(i)]++;
            second[t.charAt(i)]++;
        }
        
        for(int c = 97; c < 123; c++) {
            if(first[c] != second[c]) {
                return false;
            }
        }

        return true;
    }
}