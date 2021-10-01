package Dictinary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class Dictionary {
	
	/*
	 * This method is used to read the dictionary words line by line and compare
	 * those word letters are present in givenWord are not if it is true add those
	 * word to set else do not add to set and return the set.
	 */
	public static HashSet<String> isEnglishWord(String word) throws IOException {
		String words = word.toUpperCase();
		HashSet<String> wordsCanMake = new HashSet<String>();

		HashMap<Character, Integer> givenWordMap = isEnglishGivenWord(words);

		BufferedReader reader = new BufferedReader(new FileReader("src\\test\\java\\Dictinary\\Dictionary.txt")); //Assume Dictionary for three words WORKING, ARTISTIC and ARTS

		for (String currentWord = reader.readLine(); currentWord != null; currentWord = reader.readLine()) {

			boolean canMakeWord = true;
			HashMap<Character, Integer> currentWordMap = isEnglishGivenWord(currentWord);
			for (Character character : currentWordMap.keySet()) {

				int currentWordCharCount = currentWordMap.get(character);
				int givenWordCharCount = givenWordMap.containsKey(character) ? givenWordMap.get(character) : 0;

				if (currentWordCharCount > givenWordCharCount) {
					canMakeWord = false;
					break;
				}

			}

			if (canMakeWord == true)
				wordsCanMake.add(currentWord);

		}
		reader.close();

		return wordsCanMake;

	}
	
	/*
	 * This method is used to find given word characters and their count and put
	 * them into a Map
	 */
	private static HashMap<Character, Integer> isEnglishGivenWord(String givenword) {

		HashMap<Character, Integer> givenWordMap = new HashMap<Character, Integer>();

		for (int i = 0; i < givenword.length(); i++) {

			if (givenWordMap.containsKey(givenword.charAt(i)))

				givenWordMap.put(givenword.charAt(i), givenWordMap.get(givenword.charAt(i)) + 1);
			else
				givenWordMap.put(givenword.charAt(i), 1);

		}
		return givenWordMap;

	}

}