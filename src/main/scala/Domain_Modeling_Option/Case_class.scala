package main.scala.Domain_Modeling_Option

object Case_class {
  def main(args : Array[String]) : Unit ={
    case class Student(name: String, age: Int ,roll:Int)
    val s=Student("Suryabhan",20,105)
    println(s)
  }

}
