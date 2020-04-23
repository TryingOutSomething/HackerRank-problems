public class Solution {

    static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2)) % 12;

        String amPm = s.replaceAll("[^a-zA-Z]", "");

        if (amPm.equals("PM")) {
            hour += 12;
        }

        return String.format("%02d", hour) + s.substring(2, s.length() - 2);
    }
}
