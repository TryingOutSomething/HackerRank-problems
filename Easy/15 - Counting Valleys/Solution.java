class Solution {

   static int countingValleys(int n, String s) {
        int levels = 0;
        int valleys = 0;

        for (int i=0; i<n; i++) {
            if (s.charAt(i) == 'U') levels++;
            else if (s.charAt(i) == 'D') levels--;

            if (levels == 0 && s.charAt(i) == 'U') valleys++;
        }

        return valleys;
    }
}