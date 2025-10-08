class ScalaDay1

class Point(var x:Int, var y:Int) {
  val color: String = "red"

  def setXY(a: Int, b: Int): Unit = {
    x = a
    y = b
  }
}

object ScalaDay1 {
  def main(args: Array[String]): Unit = {
    val p1 = Point(x = 0,y = 0)
    p1.setXY(3, 7)
    
    println(s"${p1.x}, ${p1.y}")
  }
}
