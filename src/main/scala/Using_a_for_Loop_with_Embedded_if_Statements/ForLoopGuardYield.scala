package Using_a_for_Loop_with_Embedded_if_Statements

object ForLoopGuardYield {
  def main(args: Array[String]): Unit = {
    val nums = List(1, 2, 3, 4, 5, 6)
    val s = for (n <- nums if n % 2 == 0) yield n * n

    println(s)
  }

}
