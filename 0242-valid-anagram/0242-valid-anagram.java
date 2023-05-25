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

        //HashMap Solution
        //After running not efficient
        // HashMap<Character,Integer> mapS = new HashMap<>();
        // HashMap<Character,Integer> mapT = new HashMap<>();

        // for(int i = 0; i < s.length(); i++) {
        //     if(mapS.containsKey(s.charAt(i))) {
        //         mapS.put(s.charAt(i), 1 + mapS.get(s.charAt(i)));
        //     }
        //     else {
        //         mapS.put(s.charAt(i), 1);
        //     }

        //     if(mapT.containsKey(t.charAt(i))) {
        //         mapT.put(t.charAt(i), 1 + mapT.get(t.charAt(i)));
        //     }
        //     else {
        //         mapT.put(t.charAt(i), 1);
        //     }

        // }

        // if(!mapS.equals(mapT)) {
        //     return false;
        // }

        //Sorting solution
        // char[] sArray = s.toCharArray();
        // Arrays.sort(sArray);
        // char[] tArray = t.toCharArray();
        // Arrays.sort(tArray);
        // if(!Arrays.equals(sArray,tArray)) {
        //   return false;
        // }


        return true;
    }
}