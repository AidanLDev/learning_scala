  val curseWords = Map(
      "shoot" -> "Pucky",
      "darn" -> "Beans"
    )
object CensorObject extends App {
  /*
   *  Write a cencsor trait with a method that replaces the curse words with alternatives
   *  Curse Words:
   *    "shoot"
   *    "darn"
   *  Censor Words:
   *    "Pucky"
   *    "Beans"
   *
   *  Use a map to store the curse words and censor words
   */
  trait Censor:
    
    def replaceWord(wordsToReplace: String) = {
      val curseWords = Map(
      "shoot" -> "Pucky",
      "darn" -> "Beans"
    )

      println("String to replace: ")
      println(wordsToReplace)
      val curseWordsRegex = curseWords.keys.mkString("|")
      println(curseWordsRegex)
      val censoredString = curseWords.foldLeft(wordsToReplace) { case (text, (word, replacement)) =>
  text.replaceAll(word, replacement)
}
      println(censoredString)
    }

  class CensorStrings extends Censor {
    
  }

  val test = CensorStrings()
  test.replaceWord("And I am furiously shouting! darn shoot shoot  darn ")
}
