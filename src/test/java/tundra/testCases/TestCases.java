package tundra.testCases;

import java.io.IOException;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import Dictinary.Dictionary;

public class TestCases {

	@Test
	public void TC1_isEnglishWord() throws IOException {

		Set<String> set = Dictionary.isEnglishWord("WORKING");
		Assert.assertEquals(set.size(), 5);
	}

	@Test
	public void TC2_isEnglishWord() throws IOException {

		Set<String> set = Dictionary.isEnglishWord("working");
		Assert.assertEquals(set.size(), 5);

	}

	@Test
	public void TC3_isEnglishWord() throws IOException {

		Set<String> set = Dictionary.isEnglishWord("Rat");
		Assert.assertEquals(set.size(), 3);

	}

	@Test
	public void TC4_isEnglishWord() throws IOException {

		Set<String> set = Dictionary.isEnglishWord("ARTS");
		Assert.assertEquals(set.size(), 4);

	}

}
