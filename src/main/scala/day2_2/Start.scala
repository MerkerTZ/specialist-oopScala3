package day2_2

class Point(var x: Int, var y: Int) {
  override def toString: String = s"$x:$y"

  override def equals(obj: Any): Boolean = (
    if (obj.isInstanceOf[Point]) {
      val p = obj.asInstanceOf[Point]
      if (x == p.x && y == p.y)
        true
      else
        false
    }
    else false)
}

class PointAV(cs: Int) extends AnyVal{
  def x = (cs&0xffff0000) >> 16
  def y = cs&0x0000ffff
}


object Start {
  def main(args: Array[String]): Unit = {
    val p1 = Point(3, 6)
    val p2 = Point(3, 6)
    println(p1)
    println(p1 == p2)
    println(p1.equals(p2))
    println(p1.eq(p2))


    println(1l.hashCode() == 1d.hashCode())
    println(1l.## == 1d.##)


    val pv = PointAV(0x00200030)

    println(s"${pv.x}:${pv.y}")

  }
}
