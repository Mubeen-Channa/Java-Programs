import java.lang.*;

public class String_Methods
{
    public static void main(String[] args)
    {
	// length(): Returns the number of characters in the string.
	// charAt(index): Returns the character at the given index.
	// substring(start, end): Returns a substring between specified indices.
	// contains(sequence): Checks if the string contains a given sequence.
	// indexOf(sequence): Returns the index of the first occurrence of a substring or character.
	// replace(oldChar, newChar): Replaces all occurrences of a character or substring.
	// toLowerCase() and toUpperCase(): Converts the string to lowercase and uppercase.
	// trim(): Removes leading and trailing spaces.
	// equals(): Compares two strings for equality.
	// split(delimiter): Splits the string into an array based on the delimiter.

	
	// Creating a string
        String text = "Hello, Java Programming!";
        
        // 1. length(): Get the length of the string
        int length = text.length();
        System.out.println("Length of the string: " + length);

        // 2. charAt(): Get the character at a specific index
        char characterAtIndex5 = text.charAt(5);
        System.out.println("Character at index 5: " + characterAtIndex5);

        // 3. substring(): Extract a substring from the string
        String substring = text.substring(7, 11); // Extracting from index 7 to 10
        System.out.println("Substring from index 7 to 11: " + substring);

        // 4. contains(): Check if the string contains a particular sequence
        boolean containsJava = text.contains("Java");
        System.out.println("Does the string contain 'Java'? " + containsJava);

        // 5. indexOf(): Find the first occurrence of a character or string
        int indexOfJava = text.indexOf("Java");
        System.out.println("Index of 'Java': " + indexOfJava);

        // 6. replace(): Replace occurrences of a character or string
        String replacedText = text.replace("Java", "Python");
        System.out.println("Replaced 'Java' with 'Python': " + replacedText);

        // 7. toLowerCase() and toUpperCase(): Convert the string to lower and upper case
        String lowerCaseText = text.toLowerCase();
        String upperCaseText = text.toUpperCase();

        System.out.println("Lowercase: " + lowerCaseText);
        System.out.println("Uppercase: " + upperCaseText);


        // 8. trim(): Remove leading and trailing whitespace
        String textWithSpaces = "   Hello, Java!   ";
        String trimmedText = textWithSpaces.trim();
        System.out.println("Trimmed text: '" + trimmedText + "'");

        // 9. equals(): Compare two strings for equality
        String anotherText = "Hello, Java Programming!";
        boolean isEqual = text.equals(anotherText);
        System.out.println("Is text equal to anotherText? " + isEqual);

        // 10. split(): Split the string into an array based on a delimiter
        String[] words = text.split(" "); // Split by space
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
