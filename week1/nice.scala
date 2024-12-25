object Lovely extends App {
  class Person(val name: String)

  trait Nice {
    def greet() = println("Howdly doodily.")
  }

  trait Naughty {
    def beat() = println("Oi come ere u lil sheet")
  }

  class Character(override val name:String) extends Person(name) with Nice with Naughty

  val flanders = new Character("Ned")
  flanders.greet()
  flanders.beat()

}
