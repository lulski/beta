package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramCheckerTest {

  @Test
  public void two_words_are_anagram_of_each_other() {

    AnagramChecker anagramChecker = new AnagramChecker();

    anagramChecker.unfilteredWord1 = "dad";
    anagramChecker.unfilteredWord2 = "add";

    assertTrue("the isAnagram method should return true because the two words supplied are anagram of each other",
        anagramChecker.isAnagram());

  }

  @Test
  public void two_words_are_NOT_anagram_of_each_other() {

    AnagramChecker anagramChecker = new AnagramChecker();

    anagramChecker.unfilteredWord1 = "bad";
    anagramChecker.unfilteredWord2 = "add";

    assertFalse("the isAnagram method should return false because the two words supplied are NOT anagram of each other",
        anagramChecker.isAnagram());

  }

  @Test
  public void two_words_are_anagram_of_each_other_2() {

    AnagramChecker anagramChecker = new AnagramChecker();

    anagramChecker.unfilteredWord1 = "madonnaoftherocks";
    anagramChecker.unfilteredWord2 = "sodarktheconofman";

    assertTrue("the isAnagram method should return true because the two words supplied are anagram of each other",
        anagramChecker.isAnagram());

  }


  @Test
  public void strip_spaces_and_make_letters_lowercase(){
    AnagramChecker anagramChecker = new AnagramChecker();

    anagramChecker.unfilteredWord1 = "Madonna of The Rocks";
    anagramChecker.unfilteredWord2 = "So Dark The Con of Man";

    anagramChecker.stringSpaceAndMakeLowerCase();

    assertEquals("`Madonna of The Rocks` should become `madonnaoftherocks`", "madonnaoftherocks", anagramChecker.filteredWord1 );
    assertEquals("`So Dark The Con of Man` should become `sodarktheconofman`", "sodarktheconofman", anagramChecker.filteredWord2 );
  }

  @Test
  public void two_words_are_anagram_of_each_other_3_with_CaseVariation_and_space(){
    AnagramChecker anagramChecker = new AnagramChecker();

    anagramChecker.unfilteredWord1 = "Madonna of The Rocks";
    anagramChecker.unfilteredWord2 = "So Dark The Con of Man";

    assertTrue("the isAnagram method should return true because the two words supplied are anagram of each other",
        anagramChecker.isAnagram());

  }


  @Test
  public void two_words_are_NOT_anagram_of_each_other_3_with_CaseVariation_and_space(){
    AnagramChecker anagramChecker = new AnagramChecker();

    anagramChecker.unfilteredWord1 = "Madonna of The Rocks";
    anagramChecker.unfilteredWord2 = "So Foul The Con of Man";

    assertFalse("the isAnagram method should return false because the two words supplied are NOT anagram of each other",
        anagramChecker.isAnagram());

  }

}