package Substituting_Variable_into_String

object F_Interpolator {
  def main(args:Array[String]): Unit ={
    val name="Scala"
    val version=3.6
    println(f"$name \n version is $version%.1f")
  }

}
