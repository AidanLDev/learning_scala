class Compass {
  val directions = List("north", "east", "south", "west")
  var bearing = 0
  print("Initial Bearing: ")
  println(direction)
  def direction() = directions(bearing)

  def inform(turnDirection: String) {
    println("Turning: " + turnDirection + ". Now Bearing " + direction)
  }

  def turnRight() {
    bearing = (bearing + 1) % directions.size
    inform("right")
  }

  def turnLeft() {
    bearing = (bearing + (directions.size - 1)) % directions.size
    inform("left")
  }
}

val myCompass = new Compass

myCompass.turnRight
myCompass.turnLeft

myCompass.turnLeft
myCompass.turnLeft
myCompass.turnLeft

