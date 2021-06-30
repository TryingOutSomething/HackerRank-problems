class Result {
    public static long repeatedString(String s, long n) {
        long iterations = n / s.length();
        long occurrences = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                occurrences++;
        }

        long actualOccurrences = occurrences * iterations;

        long remainder = n % s.length();

        for (int j = 0; j < remainder; j++) {
            if (s.charAt(j) == 'a')
                actualOccurrences++;
        }

        return actualOccurrences;
    }

}
