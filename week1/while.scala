object While extends App {
  def whileLoop() = {
    println("Hello strange new world")
    var i = 1
    while (i <= 3) {
      println(i)
      i = i + 1
    }
  }

  whileLoop()

}

