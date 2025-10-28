package Using_a_for_Loop_with_Embedded_if_Statements



object ForLoopGuard {
  def main(args : Array[String]): Unit ={
    val number=List(1,2,3,4,5,6,6,7)
    for(n<-number if n%2==0)
      println(s"Even  = $n")
  }

}
