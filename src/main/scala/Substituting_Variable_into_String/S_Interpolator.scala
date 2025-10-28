package Substituting_Variable_into_String

object S_Interpolator {
  def main(args: Array[String]) : Unit ={
    val name="Suryabhan Singh"
    val age = 22
    val a=s"My name is $name and I am $age Years old"
    println(a)
  }

}
