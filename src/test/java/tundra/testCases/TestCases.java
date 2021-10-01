package tundra.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Dictinary.Dictionary;

public class TestCases {
	
	@Test
	public void TC1_wordCapLetters() throws IOException {

		System.out.println(Dictionary.isEnglishWord("WORKING"));
	}

	@Test
	public void TC2_wordSmallLetters() throws IOException {

		System.out.println(Dictionary.isEnglishWord("working"));
	}

	@Test
	public void TC1_wordMixedLetters() throws IOException {

		System.out.println(Dictionary.isEnglishWord("RAt"));

	}

	@Test
	public void TC1_avoidDuplicateWords() throws IOException {

		System.out.println(Dictionary.isEnglishWord("ARTS"));

	}

}
