class Result {
    public static String twoStrings(String s1, String s2) {
        HashSet<Character> charHashSetS1 = s1.chars().mapToObj(e -> (char) e)
                .collect(Collectors.toCollection(HashSet::new));

        HashSet<Character> charHashSetS2 = s2.chars().mapToObj(e -> (char) e)
                .collect(Collectors.toCollection(HashSet::new));

        charHashSetS1.retainAll(charHashSetS2);

        return charHashSetS1.size() > 0 ? "YES" : "NO";
    }
}
