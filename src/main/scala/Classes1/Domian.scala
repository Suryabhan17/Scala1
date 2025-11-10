package Classes1

object Domian {
  def main(args: Array[String]): Unit = {

   /* case class Student(name: String, age: Int, roll: Int)
    val s=Student("Suryabhan", 25, 110)
    println("Name : "+s.name +" "+"\nRoll.No : "+ s.roll)

    */
    /*
    case class Payment(amount: Double, method: String)
    val p1=Payment(500,"UPI")
    val p2=Payment(600,"CreditCard")
    println(p1)
    println(p2)

     */

    sealed trait PaymentMethod
    case class CreditCard(number:String, holder: String) extends PaymentMethod
    case class UPI(id: String) extends PaymentMethod
    case object Cash extends PaymentMethod
    case class Payment(amount:Double, method: PaymentMethod)
    val pay1=Payment(500,UPI("surya@upi"))
    val pay2=Payment(1200,CreditCard("2345-5899-9023","Surya"))
    val pay3=Payment(200,Cash)

    def printPayment(p: Payment): Unit = p.method match {
      case UPI(id) => println(s"Paid via UPI → $id")
      case CreditCard(_, h) => println(s"Paid via Credit Card → Holder: $h")
      case Cash => println("Paid via Cash")
    }

    printPayment(pay3)

  }
}
