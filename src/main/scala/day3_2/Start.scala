package day3_2

class A { println("A") }
class B extends A { println("B") }
trait T1 { println("T1") }
trait T2 extends T1 { println("T2") }
trait T3 extends B { println("T3") }
trait T4 extends B { println("T4") }
class C extends T1, T3, T4 { println("C") }

class D extends C, T3, T4, T2, T1 { println("D") }




abstract class Job {
  def work():Unit
  def workDays: List[String]
}

trait Read extends Job {
  abstract override def work(): Unit = {
    println("do some read")
    super.work()
  }
}

trait Write extends Job {
  abstract override def work(): Unit = {
    println("do some write")
    super.work()
  }
}

trait ReadAndWrite extends Read, Write

trait WorkDays extends Job {
  override def workDays: List[String] = List("mon", "tu", "wen", "th", "fr")
}


trait WorkDaysSix:
  def workDays = List("mon", "tu", "wen", "th", "fr","st")

class Employee extends Job, WorkDays {
  override def work(): Unit = println("do some work")
}

class Test extends Job, WorkDays {
  override def work(): Unit = println("do some test")
}

class Programming extends Job, WorkDaysSix {
  override def work(): Unit = println("do some programming")
}

object Start {

  def main(args: Array[String]): Unit = {
    //    D()
    val empl = new Employee() with ReadAndWrite
    val test = new Test() with Read
    val prog = new Programming() with Write

    empl.work()


    println(empl.workDays)

  }

}
