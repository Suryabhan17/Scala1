package Using_the_if_Construct_Like_a_Ternary_Operator

object IfAsTernary2 {
def main(args : Array[String]) : Unit ={
  val age=18
  val s=if(22>=age) "you select the vote" else "you are not select the vote"
  println(s)
}
}
