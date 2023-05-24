class Solution {
    
    public int romanToInt(String s) {
        int[] accessArray = new int[128];
        accessArray['I'] = 1;
        accessArray['V'] = 5;
        accessArray['X'] = 10;
        accessArray['L'] = 50;
        accessArray['C'] = 100;
        accessArray['D'] = 500;
        accessArray['M'] = 1000;

        int sum = 0;
        int prev = 0;
        int current;

        for(char c : s.toCharArray()) {
            current = accessArray[c];
            //subtract if the previous value is less than current value
            // Ex:IX   XL    XC    
            if(prev < current) {
                //Subtract the prev value twice to get to the actual value till that point
                sum -= prev + prev;
            }
            sum+= current;
            prev = current;            
        }
        return sum;
    }
}