class PointEx private(n: Int):
  require(n >= 2 && n <= 3)
  val c = new Array[Int](n)
  var color = PointApi().colorPoint
  def this(x: Int, y: Int, z: Int, n: Int) =
    this (n)
    setPointEx(x, y, z)

  def setPointEx(x: Int, y: Int, z: Int = 0) =
    c(0) = x
    c(1) = y
    if (n == 3) c(2) = z

  def getPointEx: (Int, Int, Int) = (c(0), c(1),if (n==3) c(2) else 0)
  //  def comparePointEx(): Boolean = {
  //    c(0) += 1
  //    c(1) += 1
  //    if (n == 3) c(2) += 1
  //  }

  def movePointEx(delta: Boolean = true) =
    val mvPoint = if (delta) 1 else -1
    c(0) += mvPoint
    c(1) += mvPoint
    if (n == 3) c(2) += mvPoint


object PointEx {

  def apply(array: Array[Int]) = {
    println("apply")
    new PointEx(array(0),array(1), array(2), 3)
  }

  def apply(n:Int) = {
    new PointEx(n)
  }
}

object day1 {
  def main(args: Array[String]) = {
    val p1 = PointEx.apply(3)
    p1.setPointEx(1, 2, 3)
    println(s"${p1.getPointEx}")

    val p2 = PointEx(Array(3,4,5))

    println(s"${p2.getPointEx}")

  }
}