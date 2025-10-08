
object Start {
  def main(args: Array[String]): Unit = {

    println(args.toList)
    val info = Start.getClass
    println(info.getName)
    println(info.getSuperclass.getName)

    val info2 = Class.forName("Start")
    println(info2.getName)
  }
}
