package day3

sealed abstract class Base

case class Rect(a:Int) extends Base

case class Circle(r:Int, x0:Int = 0, y0:Int = 0) extends Base:
  override def toString: String = s"r: $r, x0: $x0, y0: $y0"


enum Color(c:Int):
  case Red extends Color(3232)
  case Green extends Color(123)
  case Blue extends Color(213)
  def col = c



object Start {

  def main(args: Array[String]): Unit = {

    val r1 = Rect.apply(1)
    val r2 = Rect(10)
    val c1 = Circle(1, 5)
    val c2 = c1.copy(r = 7)

    println(Circle.unapply(c1).x0)

    val col1 = Color.Red
    println(col1.col)

    val obj:AnyRef = r2
    obj match
      case Rect(1) => println("Rect1")
      case Rect(_) => println("Some Rect")
      case Circle(1,_,_) => println("Circle2")
      case _ => println("???")
  }

}
