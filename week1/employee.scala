object Employee extends App {
  class Person(val name: String) {
    def talk(message: String) = println(name + " says " + message)
    def id(): String = name
  }

  class Employee(override val name: String, val number: Int) extends Person(name) {
    override def talk(message: String) = {
      println(name + " with numver " + number + " says " + message)
    }
    override def id():String = number.toString
  }

  val aid = new Employee("Aid", 5)
  aid.talk("Something wise ey")

}
