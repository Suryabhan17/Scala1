package Using_the_if_Construct_Like_a_Ternary_Operator

object IfAsTernary {
  def main(args : Array[String]) : Unit ={
    val a=89
    val b=48
    val c =if (a>b) a else b
    println(s"Maximum valu is : $c")
  }

}
