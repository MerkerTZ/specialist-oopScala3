case class Rect(a: Int, b: Int, center: (Int, Int)) extends Figura(center) {
  def this(a: Int, b: Int) = this(a, b, (0, 0))

  def area(): Double = a.toDouble * b.toDouble

  def getRect: String = s"long: $a, short: $b, center: ${getCenter} " +
    s"\narea ${area()}"
}

case class RectEx(a: Int, b: Int) extends FiguraEx {
  def this(a: Int) = this(a, a)

  override def area: Double = a.toDouble * b.toDouble

  override def getFigureEx: String = s"Rectangle long: $a, short: $b, center: ${getCenter} area ${area}"
}
