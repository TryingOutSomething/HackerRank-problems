import java.util.*;

class Result {

    public static int alternatingCharacters(String s) {
        char[] characters = s.toCharArray();
        char currentCharacter = characters[0];
        int consecutiveCharacters = 0;

        for (int i = 1; i < characters.length; i++) {
            if (characters[i] == currentCharacter) {
                consecutiveCharacters++;
            }

            currentCharacter = characters[i];
        }

        return consecutiveCharacters;
    }
}
