package day2_2_2

class Test(private var r: Int):
  def cmpTest(t: Test) = this.r - t.r

object Start {
  def main(args: Array[String]): Unit = {


    val t1 = Test(1)
    println(t1.cmpTest(Test(4)))
    println("ok")
    val sphere1 = day2_2_2.AnyRef(1.0)
    val sphere2 = day2_2_2.AnyRef(1.0)
    sphere1.setR(10.0)
    println(sphere1.hashCode())
    println(sphere2.hashCode())
  }
}

package day2_2_2 {
  class AnyRef(var r: Double) {
    override def toString: String = s"Sphere r $r"

    def setR(r: Double) = this.r = r

    def getArea: Double = r * r * math.Pi

    override def hashCode(): Int = (r,getArea).##
  }
}
