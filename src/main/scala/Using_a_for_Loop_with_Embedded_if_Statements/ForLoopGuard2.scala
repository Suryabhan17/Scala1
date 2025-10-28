package Using_a_for_Loop_with_Embedded_if_Statements

object ForLoopGuard2 {
  def main(args : Array[String]): Unit={
    val number= List(1,2,3,4,5,6,7,8,9,10)
    for(n<-number if n%2 == 0; if n>3)
      println(n)
  }

}
