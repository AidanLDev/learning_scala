object Constructor extends App {
  class Person(firstName: String) {
    println("Outer constructor")
    def this(firstName: String, lastName: String) = {
      this(firstName)
      println("Inner Constructor")
    }
    def talk() = println("Hi, I'm human")
  }

  var bob = new Person("Bob")
  val bobTate = new Person("Bob", "Tate")

  bob.talk()
}
