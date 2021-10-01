package tundra.testCases;

import java.io.IOException;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import Dictinary.Dictionary;

public class TestCases {
	
	@Test
	public void TC1_isEnglishWord() throws IOException {
		
        Set<String> set=Dictionary.isEnglishWord("WORKING");
        Assert.assertNotNull(set);
	}

	@Test
	public void TC2_isEnglishWord() throws IOException {

        Set<String> set=Dictionary.isEnglishWord("working");
        Assert.assertNotNull(set);
     
	}

	@Test
	public void TC3_isEnglishWord() throws IOException {

        Set<String> set=Dictionary.isEnglishWord("Rat");
        Assert.assertNotNull(set);
     
	}

	@Test
	public void TC4_isEnglishWord() throws IOException {

        Set<String> set=Dictionary.isEnglishWord("ARTS");
        Assert.assertNotNull(set);
     
	}

}
