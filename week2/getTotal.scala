object GetTotalObject extends App {
  val ages = List(30, 30, 61, 60)
  val totalAge = ages.foldLeft(0)((acc, cur) => acc + cur)
  println("The total age is:")
  println(totalAge)
}
