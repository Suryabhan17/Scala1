package Looping

object ForWithCondition {
  def main(args: Array[String]): Unit ={
    val num =List(1,2,3,4,5,6,7)
    for (v <-  num if v % 2 == 0)
      println(s"$v")
  }

}
