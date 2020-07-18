package test;

public class AnagramChecker {

  String word1;
  String word2;

  public Boolean isAnagram() {

    char[] word1Array = this.word1.toCharArray();
    char[] word2Array = this.word2.toCharArray();


    if (word1Array.length == word2Array.length) {
      if ( iterateStringLookForCharMatch(word1, word2) ){
        if (iterateStringLookForCharMatch(word2, word1)){

          System.out.println(">>> end result! "+word1+" and " +word1+" are anagram to each other");
            return true;
        }else{
          System.out.println(">>> end result! "+word1+" and " +word1+" are NOT anagram to each other");
          return false;
        }
      }else{
        System.out.println(">>> end result! "+word1+" and " +word1+" are NOT anagram to each other");
        return false;
      }
    }else {
      System.out.println(">>> words are of different length NOT an anagram");
      return false;
    }

  }

  public Boolean iterateStringLookForCharMatch(String word1, String word2) {
    char[] word1Array = word1.toCharArray();

    // anagram word is two words that consisted
    // same number of letters
    // same letters
    System.out.println("::: anagram check " + word1 + " vs " + word2);

      for (char c : word1Array) {

        System.out.println("   does " + c + " exist in " + word1);
        if (this.word2.indexOf(c) > -1) {
          System.out.println("   >>> " + c + " exist in " + word1);
        } else {
          System.out.println("   >>> " + c + " doesn't exist in " + word1);
          return false;
        }


      }
      System.out.println(" all letters from `" + word1 + "` exist in `" + word2 +"`");

      return true;
    }



}