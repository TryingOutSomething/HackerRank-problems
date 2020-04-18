public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
        int strLength = s.length();
        double sqrtResult = Math.sqrt(strLength);

        int row = (int) Math.floor(sqrtResult);
        int column = (int) Math.ceil(sqrtResult);

        if (row * column < strLength)
            row = column;

        String encStr = "";

        for (int i = 0; i < column; i++) {
            for (int j = i; j < strLength; j += column) {
                encStr += s.charAt(j);
            }
            encStr += " ";
        }

        System.out.println(encStr);

        return encStr;
    }
}
