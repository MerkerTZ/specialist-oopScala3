class Start

class Figura(private var center: (Int, Int)):
  def move(dx: Int, dy: Int) = center = (center._1 + dx, center._2 + dy)

  def getCenter = center


abstract class FiguraEx():
  var center = (0, 0)

  def move(dx: Int, dy: Int) = center = (center._1 + dx, center._2 + dy)

  def setCenter(cent: (Int, Int)) = center = cent

  def getCenter = center

  def getFigureEx:String
  def area:Double

object Start {
  def areas(d: Array[FiguraEx]) =
    d.foreach {
      obj=>println(obj.getFigureEx)
//      case ex: RectEx => println(ex.getRectEx)
//      case circle: Circle => println(circle.getCircle)
//      case _ =>
    }

  def main(args: Array[String]): Unit = {
    //    val f = Rect(3,10)
    //    println(f.getRect)

    val r = RectEx(3)
    r.move(3, -5)
    //    println(r.getRect)
    //    println(r.getRect)

    var c = Circle(1)
    //    println(c.getCircle)

    val arr = Array[FiguraEx](r, c, r, Triangle(1,2,3))
    areas(arr)
  }
}
