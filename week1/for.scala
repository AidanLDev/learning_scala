object For extends App {

  def forLoop() = {

    for (i <- 0 until args.length) {
      println(args(i))
    }
  }

  forLoop()
}
