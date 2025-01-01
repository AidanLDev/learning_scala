object SizerObject extends App {
  println("Starting the program!")

  import scala.io._

  object PageLoader {
    def getPageSize(url: String) = Source.fromURL(url).mkString.length
  }

  val urls = List(
      "https://www.amazon.co.uk",
      "https://www.google.co.uk",
      "https://www.bbc.co.uk",
      "https://www.x.com"
    )

}
