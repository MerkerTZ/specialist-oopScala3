class Circle(r: Int) extends FiguraEx {
  def area(): Double = math.Pi * r * r
  override def getFigureEx: String = s"Circle r: ${area()} $getCenter"
}
