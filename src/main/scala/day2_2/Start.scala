package day2_2

class Point():
  var x:Int
  var y:Int
  def this(a: Int, b: Int) = (x = a, y = b)
  override def toString: String = s"$x:$y"

  override def equals(obj: Any): Boolean = (
    if (obj.isInstanceOf[Point])
      if(x == obj.asInstanceOf[Point].x)
  else false)

object Start {
  def main(args: Array[String]): Unit = {
    val p1 = Point(3, 6)
    val p2 = Point(3, 6)
    println(p1)
    println(p1.equals(p2))
  }
}
