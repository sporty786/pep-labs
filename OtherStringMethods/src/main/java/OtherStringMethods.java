import java.util.List.*;
import java.util.ArrayList;

/**
 * Official String documentation: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
 */
public class OtherStringMethods {
    /**
     * Substring will become an important part of solving puzzles with strings. It allows you to get part of a string
     * - eg, substring(0,3) of "banana" is "ban". (first number inclusive, second number exclusive.)
     * @param s the string to be manipulated
     * @param start the index of the start of the substring, inclusive.
     * @param end the index of the end of the substring, exclusive.
     * @return
     */
    public String partOfString(String s, int start, int end){
        String part = "";
        for (int i = start; i < end; i++){part += s.charAt(i);}
        return part;
    }

    // public static void main(String[] args){
        // String test = "Hello we test String methods.";
        // OtherStringMethods osm = new OtherStringMethods();
        // System.out.println(osm.partOfString(test, 0, 5));
        // System.out.println("Hello");
        // System.out.println(osm.partOfString(test, 6, 8));
        // System.out.println("we");
        // System.out.println(osm.compareLexigraphically("abc","xyz"));
        // System.out.println("1");
        // System.out.println(osm.compareLexigraphically("always","about"));
        // System.out.println("-1");
        // System.out.println(osm.compareLexigraphically("test", "test"));
        // System.out.println("0");
        // String[] split = osm.splitStringIntoMultipleStrings("src.main.java", "\\.");
        // System.out.print("[");
        // for (int i = 0; i < split.length; i++){
        //     System.out.print(split[i] + ", ");
        // }
        // System.out.print("]\n[Hello, we, test, String, methods.]\n");
        // System.out.println(split.length);
    // }

    /**
     * All classes have methods equals and toString because they inherit them from the Object class by extending the
     * Object class - how do we mandate that a class exhibits certain behaviors apart from those provided by the
     * Object class? The answer is interfaces. Strings implement the Comparable interface, which means that they have a
     * compareTo method. Strings' compareTo method compares Strings as if they're in a dictionary - ie, "cat" is
     * less than "dog". We can compare them as such as catString.compareTo(dogString).
     * @param s1 the first String to be compared.
     * @param s2 the second String to be compared.
     * @return a number greater than 0 if s1 > s2 lexigraphically, a number less than 0 is s1 < s2 lexigraphically,
     * and 0 if s1 is equivalent to s2.
     */
    public int compareLexigraphically(String s1, String s2){
        if (s1.equals(s2)){return 0;}
        String dict = "0123456789abcdefghijklmnopqrstuvwxyz";
        boolean s1letter;
        boolean s2letter;
        int shortest;
        if (s1.length() >= s2.length()){shortest = s1.length();}
        else {shortest = s2.length();}
        for (int i = 0; i < shortest; i ++){
            s1letter = false;
            s2letter = false;
            for (int n = 0; n < dict.length(); n++){
                if ((dict.charAt(n)) == (s1.charAt(i))){s1letter = true;}
                if ((dict.charAt(n)) == (s2.charAt(i))){s2letter = true;}
                if (s1letter && !s2letter){return 1;}
                else if (s2letter && !s1letter){return -1;}
                else if (s1letter && s2letter){break;}
            }
        }
        return 0;
    }

    /**
     * The split method is useful for dividing a string into multiple strings, most notably for dividing a sentence
     * into its constituent words. For instance, if String sentence = "my favorite sentence", sentence.split(" ")
     * will return an array that contains {"my", "favorite", "sentence"}.
     * @param s1 the string to be manipulated.
     * @param splitAround the string that will be the text that s1 is split around (eg, for dividing a sentence into
     *                    words we use " ".
     * @return an array of Strings that represent s1 split by splitAround.
     */
    public String[] splitStringIntoMultipleStrings(String s1, String splitAround){
        return s1.split(splitAround);
    //     ArrayList<String> split = new ArrayList<>();
    //     String word = "";
    //     int x = 0;
    //     for (int i = 0; i < s1.length(); i++){
    //         char letter = s1.charAt(i);
    //         word += letter;
    //         if (letter == splitAround.charAt(x)){x++;}
    //         if (x == splitAround.length()){
    //             word = word.substring(0, word.length() - splitAround.length());
    //             split.add(word);
    //             word = "";
    //             x = 0;
    //         }
    //     }
    //     if (!word.isBlank()){split.add(word);}
    //     String[] fin = new String[split.size()];
    //     for (int i = 0; i < split.size(); i++){
    //         fin[i] = split.get(i);
    //     }
    //     for (int i = 0; i < fin.length; i++){System.out.println(fin[i]);}
    //     return fin;
    // }
}
