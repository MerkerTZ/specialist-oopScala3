class Triangle(a:Int, b:Int, c:Int) extends FiguraEx{

  override def getFigureEx: String = s"Triangle area $area"

  override def area: Double = a * b * c
}
