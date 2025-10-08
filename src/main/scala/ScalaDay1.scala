class ScalaDay1

class Point {
  var x: Int = 0
  var y: Int = 0
  val color: String = "red"

  def setXY(a: Int, b: Int): Unit = {
    x = a
    y = b
  }
}

object ScalaDay1 {
  def main(args: Array[String]): Unit = {
    val p1 = Point()
    p1.setXY(3, 7)
    println(s"""${p1.x}, ${p1.y}""")
  }
}
