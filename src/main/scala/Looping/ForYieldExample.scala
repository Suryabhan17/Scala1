package Looping

object ForYieldExample {
  def main(args: Array[String]): Unit = {
    val nums = List(1, 2, 3, 4, 5)

    val squares = for (n <- nums) yield n * n

    println(squares)
  }

}
