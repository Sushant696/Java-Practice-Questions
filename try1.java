
public class try1 {
    public static int countVowels(String userInput, char[] vowels) {
        int count = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char ch = Character.toLowerCase(userInput.charAt(i));
            for (char vowel : vowels) {
                if (ch == vowel) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static int countConsonants(String userInput, char[] consonants) {
        int count = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char ch = Character.toLowerCase(userInput.charAt(i));
            for (char consonant : consonants) {
                if (ch == consonant) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String userInput = "thequickbrownfoxjumpsoverthelazydog";

        char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u' };
        char[] consonants = new char[] { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't',
                'v', 'w', 'x', 'y', 'z' };

        System.out.println("Number of vowels in the string: " + countVowels(userInput, vowels));
        System.out.println("Number of consonants in the string: " + countConsonants(userInput, consonants));
    }
}
