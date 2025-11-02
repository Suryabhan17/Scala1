package add1

object add {
  def main(args: Array[String]): Unit = {
  /*  val a =List (1, 2, 3, 4, 5, 6, 7)
  val b=a.filter(_>4)
   val c= for(n<-b) yield n+1

    println(c) */
    /*val name=List("Ram","Shyam","Mohan")
    val marks=List(85,89,95)
    val d=name ::: marks
    println(d)*/

    val a=List(1,2,3,4,5,6)
    val square= a.map(x => x*2)
    println(square)

  }
}
