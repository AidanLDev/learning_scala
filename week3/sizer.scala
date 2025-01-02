import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.io.Source
import scala.util.{Success, Failure}

object SizerObject extends App {
  println("Starting the program!")
  
  object PageLoader {
    def getPageSize(url: String): Int = {
      try {
        val content = Source.fromURL(url).mkString
        content.length
      } catch {
        case e: Exception => 
          println(s"Error loading $url: ${e.getMessage}")
          0
      }
    }
  }

  val urls = List(
    "https://www.amazon.co.uk",
    "https://www.google.co.uk",
    "https://www.bbc.co.uk",
    "https://www.x.com"
  )

  def timeMethod(method: () => Unit): Unit = {
    val start = System.nanoTime
    method()
    val end = System.nanoTime
    println("Method took " + (end - start)/1000000000.0 + " seconds.")
  }

  def getPageSizesSequentially(): Unit = {
    for (url <- urls) {
      println("Size for " + url + ": " + PageLoader.getPageSize(url))
    }
  }

  def getPageSizesConcurrently(): Unit = {
    // Create a Future for each URL
    val futures = urls.map { url =>
      Future {
        (url, PageLoader.getPageSize(url))
      }
    }
    
    // Wait for all futures to complete
    val futureSequence = Future.sequence(futures)
    
    // Block and get results
    try {
      val results = Await.result(futureSequence, 30.seconds)
      results.foreach { case (url, size) =>
        println("Size for " + url + ": " + size)
      }
    } catch {
      case e: Exception => 
        println(s"Error in concurrent execution: ${e.getMessage}")
    }
  }

  println("Sequential run:")
  timeMethod(() => getPageSizesSequentially())
  
  println("\nConcurrent run:")
  timeMethod(() => getPageSizesConcurrently())
}
