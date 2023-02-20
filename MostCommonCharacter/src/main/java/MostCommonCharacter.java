import java.util.Map;
import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> charFreq = new HashMap<>();
        String chars = "";
        for (int i = 0; i < str.length(); i++){
            char letter = str.charAt(i);
            if (charFreq.get(letter) != null){charFreq.put(letter, charFreq.get(letter));}
            else {
                charFreq.put(letter, 1);
                chars += letter;
            }
        }
        int biggest;
        char recur;
        if (str.length() <= 0){return ' ';}
        recur = chars.charAt(0);
        biggest = charFreq.get(recur);
        for (int i = 1; i < chars.length(); i++){
            int freq = charFreq.get(chars.charAt(i));
            if (freq > biggest){
                biggest = freq;
                recur = chars.charAt(i);
            }
        }
        return recur;
    }
}
