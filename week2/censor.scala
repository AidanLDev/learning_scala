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
      println(curseWords("shoot"))
    }

  class CensorStrings extends Censor {
    
  }

  val test = CensorStrings()
  test.replaceWord("And I am furiously shouting!")
}
