package day3_1

import scala.util.Sorting

case class Employee (name:String,
                     age:Int,
                     room:String) extends  Ordered[Employee]{

  override def compare(that: Employee): Int = age-that.age
}


object SortByName extends Ordering[Employee]{

  override def compare(x: Employee, y: Employee): Int = x.name.compare(y.name)
}

object SortByRoom extends Ordering[Employee] {

  override def compare(x: Employee, y: Employee): Int = x.room.compare(y.room)
}

object SortByRoomAndName extends Ordering[Employee] {

  override def compare(x: Employee, y: Employee): Int = x.room.compareTo(y.room) match
    case 0 => x.name.compareTo(y.name)
    case i if i < 0 => -1
    case i if i > 0 => +1
}

object Start {

  def main(args: Array[String]): Unit = {
    val e1 = Employee("Timur", 26, "625")
    val e2 = Employee("Nastya", 24, "625")
    val e3 = Employee("Kolya", 26, "240a")

    val dat = Array[Employee](e1,e3,e2, Employee("Duke", 1, "625"))

//    Sorting.quickSort(dat)(SortByRoomAndName())

    dat
      .sortBy(obj => (obj.room.reverse, obj.age))
      .foreach(println(_))

  }
}
