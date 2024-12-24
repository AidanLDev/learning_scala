object Ruby extends App {
  def rubyStyleForLoop() = {
    "this string".foreach { arg =>
      println(arg)
    }
  }
  rubyStyleForLoop()
}
