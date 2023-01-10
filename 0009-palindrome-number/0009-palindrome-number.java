class Solution {
    public boolean isPalindrome(int x) {
        String forward = x + "";
        boolean isPalin = true;
        int counter = 0;
        while(isPalin && counter < forward.length()) {
            for(int i = 0; i < forward.length(); i++) {
                counter++;
                if(forward.charAt(i) != forward.charAt(forward.length()- i - 1)) {
                    isPalin = false;
                }
            }
        }
        return isPalin;        
    }
}