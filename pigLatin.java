import java.io.*;

//defines which letters are vowels and returns true if index is a vowel
public class pigLatin {
	public static boolean isVowel (char c) { //returns true if the index c is a vowel
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'); 
    }
    //translates words into piglatin
    public static String pigLatinTwo(String word) { 

        // store index of the first vowel 
        int length = word.length(); 
        int index = -1; //index = all the letters in the word after & including the fist vowel
        for (int i = 0; i < length; i=i+1){ //checks if each letter is a vowel
            if (isVowel(word.charAt(i))) { //if the letter is a vowel, start index here and exit for loop
                index = i; 
            break; //leave for loop if index is a vowel
            } 
        } 
        /* Take all characters after index (including 
        index) and append all characters which are before 
        index. Then, append "ay" */
        return word.substring(index) + word.substring(0, index) + "ay "; 
    }  
    /*defines string being translated
    and prints out the resulting translation*/
    public static void main(String[]args) {
        for (int b = 0; b<args.length; b=b+1){
            System.out.print(pigLatinTwo(args[b])); //prints piglatin translation
        }
    
    }
}
