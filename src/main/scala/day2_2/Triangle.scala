package day2_2

case class Triangle(a:Int, b:Int) extends FiguraEx{

  override def getFigureEx: String = s"Triangle area $area"

  override def area: Double = a * b * 0.5
}
