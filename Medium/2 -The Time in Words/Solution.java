public class Solution {

    static String timeInWords(int h, int m) {
        String[] words = getWordTimeList();

        if (m == 0) {
            return words[h] + " o' clock";
        }

        if (m == 1) {
            return "one minute past " + words[h];
        }

        if (m == 15) {
            return "quarter past " + words[h];
        }

        if (m == 45) {
            return "quarter to " + words[h + 1];
        }

        if (m < 30) {
            return words[m] + " minute" + (m <= 1 ? "" : "s") + " past " + words[h];
        }

        if (m == 30) {
            return "half past " + words[h];
        }

        return words[60 - m] + " minute" + (m <= 1 ? "" : "s") + " to " + words[h + 1];

    }

    static String[] getWordTimeList() {
        String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
                "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six",
                "twenty seven", "twenty eight", "twenty nine" };

        return words;
    }
}
