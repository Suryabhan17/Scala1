package NewCollation_yield_in_for

object ForYield2 {
  def main(args : Array[String]): Unit ={
    val name=List("scala","java",
    "python")
    val uppercase =for(n<-name) yield n.toUpperCase()
    println(uppercase)
  }

}
