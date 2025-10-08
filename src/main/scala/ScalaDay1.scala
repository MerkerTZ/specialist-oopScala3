class ScalaDay1

class Point(var x:Int, var y:Int) {
  def this() = this(0,0)
  def this(c:Int) = this(c,c)

  val color: String = "red"

  def setXY(a: Int, b: Int): Unit = {
    x = a
    y = b
  }
}

object ScalaDay1 {
  def main(args: Array[String]): Unit = {
    val p1 = Point(0, 0)
    p1.setXY(3, 7)
    val p2 = Point(2)
    val p3 = Point()

    println(s"Point1: ${p1.x}, ${p1.y}")
    println(s"Point2: ${p2.x}, ${p2.y}")
    println(s"Point3: ${p3.x}, ${p3.y}")

  }
}
