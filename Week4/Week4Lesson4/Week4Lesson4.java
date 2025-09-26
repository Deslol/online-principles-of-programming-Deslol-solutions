public class Week4Lesson4 {

    public static void main(String[] args) {
        Week4Lesson4 exercise = new Week4Lesson4();
        String example = "This is an example string";
        exercise.printCharsInString(example);
        exercise.printStringInReverse(example);
        exercise.printStringInUppercase(example);
        System.out.println(exercise.encryptText("ABC", 3));
        System.out.println(exercise.decryptText("DEF", 3));
    }

    /*
     * Modify the method below so that it prints out each character in the string
     * on a new line.
     */

    public void printCharsInString(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    /*
     * Modify the method below so that it prints out
     * the string in reverse order
     */

    public void printStringInReverse(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.printf("%s", s.charAt(i));
        }
        System.out.println();
    }

    /*
     * Modify the method below so that it prints out
     * the string as all uppercase
     */

    public void printStringInUppercase(String s) {
        String upperCase = s.toUpperCase();
        System.out.println(upperCase);
    }

    /*
     * Implement the method below which encrypts the
     * text passed in as an argument using a
     * Ceaser cypher.
     *
     * https://en.wikipedia.org/wiki/Caesar_cipher
     *
     * This is illustrated below
     *
     * input string = "ABC"
     * shift by = 3
     * encrypted text = "DEF"
     */
    public String encryptText(String s, int shiftBy) {
        char[] convertedText = new char[s.length()];
        // 1. convert the text into index at unicode
        // 2. + shiftBy number
        // 3. convert it back to text
        for(int i=0;i < s.length(); i++){
            convertedText[i] = Character.toChars(s.codePointAt(i) + shiftBy)[0];
        }
        return new String(convertedText);
    }

    /*
     * Implement the method below which decrypts a
     * Ceaser cypher encrypted message
     *
     */

    public String decryptText(String s, int shiftBy) {
        char[] convertedText = new char[s.length()];
        for(int i=0;i < s.length(); i++){
            convertedText[i] = Character.toChars(s.codePointAt(i) - shiftBy)[0];
        }
        return new String(convertedText);
    }
}
