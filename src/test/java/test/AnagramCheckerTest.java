package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramCheckerTest {

  @Test
  public void two_words_are_anagram_of_each_other(){

    AnagramChecker anagramChecker = new AnagramChecker();

    anagramChecker.word1 = "dad";
    anagramChecker.word2 = "add";

    assertTrue("the isAnagram method should return true because the two words supplied are anagram of each other",
     anagramChecker.isAnagram());


  }

  @Test
  public void two_words_are_NOT_anagram_of_each_other(){

    AnagramChecker anagramChecker = new AnagramChecker();

    anagramChecker.word1 = "bad";
    anagramChecker.word2 = "add";

    assertFalse("the isAnagram method should return false because the two words supplied are NOT anagram of each other",
     anagramChecker.isAnagram());


  }

  @Test
  public void two_words_are_anagram_of_each_other_2(){

    AnagramChecker anagramChecker = new AnagramChecker();

    anagramChecker.word1 = "madonnaoftherocks";
    anagramChecker.word2 = "sodarktheconofman";

    assertTrue("the isAnagram method should return false because the two words supplied are NOT anagram of each other",
     anagramChecker.isAnagram());


  }

}