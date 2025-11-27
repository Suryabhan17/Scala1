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
  /*
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
    
   */
     /*
    class Student(val name :  String , val age: Int  ) {
      def i(): String =s"$name is $age year Student"
    }
    val a=new Student("Suryabhan",22)
    println(a.i())
    
      */
    /*
    class Book(val title: String, val price:Int) {
     def this(title:String)=this(title,0)
   }
    val b=new Book("Scala Guide",56)
    println(b.title+" " + b.price )
    
     */
    /*
    case class Person(name: String, age:Int)
    val p=Person("Amit",25)
    println(p.name)
    
    
     */
    /*
    object test {
     def apply() : Int={
       println("Surya")
       100
     }
   }
    test()

     */
    /*
    class A {
     def apply(a:Int, b: Int):Int=a+b
   }
    val d=new A()
    println(d(15,58))


     */

    /*
    case class person(name:String, age:Int)
    def check(p:person)=p match{
      case person("Ravi", 20) => "This is Ravi"
      case person(name,age)=> s"Suser: $name , Age: $age"
    }
    println(check(person("Ravi", 20)))
    println(check(person("Amit", 30)))


     */

    /*
    case class Laptop(brand:String="Hp",price:Int=85000)
    val l=Laptop()
    println(l)


     */
    /*
    case class A(name:String, age: Int)
    case class V(village:String, pin:Int, a:A)
    val t=new V("Jhanga",25689, A("Surya",25))
    println(t)

     */
    /*
    case class Student(name:String, age:Int,collage: Collage)
    case class Collage(name:String, location:String)
    val Details = new Student("Surya",25,Collage("BBDNIIT","Lucknow"))
    println(Details)


     */



  }
}
