package test;

public class AnagramChecker {

  String unfilteredWord1;
  String unfilteredWord2;

  String filteredWord1;
  String filteredWord2;

  public Boolean isAnagram() {

    // normalize the words first, make it lowercase and remove spaces
    this.stringSpaceAndMakeLowerCase();

    char[] word1Array = this.filteredWord1.toCharArray();
    char[] word2Array = this.filteredWord2.toCharArray();

    if (word1Array.length == word2Array.length) {
      if (iterateStringLookForCharMatch(filteredWord1, filteredWord2)) {
        if (iterateStringLookForCharMatch(filteredWord2, filteredWord1)) {

          System.out
              .println(">>> end result! " + unfilteredWord1 + " and " + unfilteredWord2 + " are anagram to each other");
          return true;
        } else {
          System.out.println(
              ">>> end result! " + unfilteredWord1 + " and " + unfilteredWord2 + " are NOT anagram to each other");
          return false;
        }
      } else {
        System.out.println(
            ">>> end result! " + unfilteredWord1 + " and " + unfilteredWord2 + " are NOT anagram to each other");
        return false;
      }
    } else {
      System.out.println(">>> words are of different length NOT an anagram");
      return false;
    }

  }

  public void stringSpaceAndMakeLowerCase() {
    this.filteredWord1 = this.unfilteredWord1.toLowerCase().replaceAll(" ", "");
    this.filteredWord2 = this.unfilteredWord2.toLowerCase().replaceAll(" ", "");
  }

  public Boolean iterateStringLookForCharMatch(String word1, String word2) {
    char[] word1Array = word1.toCharArray();

    // anagram word is two words that consisted
    // same number of letters
    // same letters
    System.out.println("::: anagram check " + word1 + " vs " + word2);

    for (char c : word1Array) {

      System.out.println("   does " + c + " exist in " + word1 + "?");
      if (word2.indexOf(c) > -1) {
        System.out.println("   >>> " + c + " exist in " + word2);
      } else {
        System.out.println("   >>> " + c + " doesn't exist in " + word2);
        return false;
      }

    }
    System.out.println(" all letters from `" + word1 + "` exist in `" + word2 + "`");

    return true;
  }

}