package Classes1

import scala.util.Success

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


    /*
    sealed trait Payment

    case class Card(number: String) extends Payment
    case class UPI(id: String) extends Payment
    case object Cash extends Payment

    sealed trait PaymentR

    case object Success extends PaymentR
    case class Failure(reason: String) extends PaymentR


    def Payment1(method: Payment): PaymentR=
       method match {
         case Card(number) =>
           if(number.startsWith("")) Success
           else Failure("Invalid Card Number")
         case UPI(id) =>
           if(id.contains("@")) Success
           else Failure("Invalid UPI ID")
         case Cash =>
           Success
       }

    val p1=Payment1(Card("45892"))
    val p2 = Payment1(UPI("rahul@ybl"))
    val p3 = Payment1(UPI("invalidUPI"))
    val p4 = Payment1(Cash)

    println("p1"+p1)
    println("p2"+p2)
    println("p3"+p3)
    println("p4"+p4)

     */
    /*
    sealed trait Vishal
    case class bankAcount(name:String,NumAcount:Int/*,card: Card,acountD:AcountD*/) extends  Vishal
    case class Card(number: String, pin:String) extends Vishal
    case class AcountD(Village:String, Pin:Int)  extends Vishal

   //  val a= new bankAcount("Vishal",2589452,Card("4859585",5894),AcountD("jhanga",256894))
    // println(a.name)
    sealed trait Surya
    case object Success extends Surya
    case class Failure(reason: String) extends Surya

    def pay(method: Vishal): Surya=
      method match {
        case Card(number,pin)=>
          if (number.startsWith("")) Success
          else Failure("Invalid Number")



      }

     */

    /*
    class Pizza(
                 var crustSize: CrustSize,
                 var crustType: CrustType,
                 val toppings: ArrayBuffer[Topping]
               )


    def addTopping(t: Topping): Unit =
      toppings += t

    def removeTopping(t: Topping): Unit =
      toppings -= t

    def removeAllToppings(): Unit =
      toppings.clear()

    class Order

    private lineItems = ArrayBuffer[Product]()

    def addItem(p: Product): Unit =

    def removeItem(p: Product): Unit =

    def getItems(): Seq[Product] =

    def getPrintableReceipt(): String =

    def getTotalPrice(): Money = ???
    end Order

    // usage:
    val o = Order()
    o.addItem(Pizza(Small, Thin, ArrayBuffer(Cheese, Pepperoni)))
    o.addItem(Cheesesticks)
    sealed trait Product
    class Pizza extends Product
    class Beverage extends Product
    class Cheesesticks extends Product


     */

    /*
    case class A(name : String, age : Int)
      val a=A("Surya",45)
      println(a.name)



     */
    /*
    class Person(name:String, Lastname:String) {
      def show(): Unit={
        println(s"Name=$name /n LastName=$Lastname")
      }

    }
    val p = new Person("Surya", "Singh")
    p.show()

     */
    /*
    class A(a:Int)(b:Int) {
      def sum=a+b
      println(sum)
    }
    val d=new A(45)(58)


     */

    /*
    class Employee private(var name: String, val salary: Int)

    object Employee {
      def apply(name: String, salary: Int): Employee = {
        require(salary > 0, "Salary must be positive")
        new Employee(name, salary)
        
        
      }
    }

    val e = Employee("Raj", 50000)
    e.name="suryq"
      println(e.name)
    println(e.salary)
     
     
     */

    /*
    class Person (val name:String, val age:Int)
    object Person {
      def create(name:String, age:Int):Person=
        new Person(name, age)
    }
    val p=new Person("Surya",25)
    println(p.name)
    //val p=Person.create("Surya", 25)
    
    
     */

    /*
    class Person private (val name:String, val age: Int) 
      object Person {
        def A(name:String, age:Int): Person=
          new Person(name, age)
           
    }
    val p= Person.A("Surya",25)
    println(p.name)
    
    
     */

    /*
    class  Student private(val name:String, val marks:Int)
      object Student {
        def A(name:String , marks:Int): Student = {
           require(marks>0,"Marks is negative")
          new Student(name, marks)
          
        }
        
      }
    val p = Student.A("Surya", 98)
    
    println( "Name="+p.name + " " +"Marks=" + p.marks)
    
     */
    /*
    class  Config private() 
      object Config {
        private val a=new Config()
        def getA(): Config=a
    }
    val log1=Config.getA()
    val log2=Config.getA()
    println(log1 == log2)
    
     */

    /*
    class Laptop(val brand:String="A", val ram:String="", val price:String="")
      val a= new Laptop("HP")
    val b= new Laptop("HP","8GB")
    val c=new Laptop("30000")
    //println(a.brand)
    println(b)
    
     */

    /*

    class Animal {


      def eat() = println("Animal eating")
    }
    class Dog extends Animal {


      def bark() = println("Dog barking")
    }
     def run() ={

       val d = new Dog
       d.eat()
       d.bark()
     }
    run()
    case class User(name: String, id: Int)

    val u1 = User("Surya", 100)
    val u2 = u1.copy(name = "Amit")

    println(u1)
    println(u2)


     */
    /*
    abstract class Animal {
      def sound(): String // abstract method

      def info(): Unit = { // concrete method
        println("This is an animal")
      }
    }
    class Dog extends Animal {
      def sound(): String = "Bark"
    }

    val d = new Dog()
    println(d.sound())
    d.info()

     */
    /*
  class A private(val name:String, val age:Int)
      object A {
        def AB(name:String , age:Int) : A=new A(name , age)
      }


    val p = A.AB("Surya", 25)
    println(p.name)

     */

    /*
    class A private (val name: String, var age : Int , val village:String)
         object A {
           def AB(name:String, age:Int, village:String) : A=new A(name, age, village)


         }

          val p=A.AB("Syer",45,"jhanga")
            val d=(p.age)
            // val c= for{i <- e} yield i > 15
            println(d)

       */

    /*
    trait A {
        def a(): Unit=println("A")
      }
    class B extends A {
      def b() : Unit = println("B")
    }
     val v=new B()
     v.a()
    v.b()


     */

    /*
    abstract class  A(val name: String, val age:Int ){
      def a() : Unit
      def b() : Unit=println(s"Name : $name and Age : $age")
    }
     class B (name: String , age:Int) extends A(name, age){
       def a(): Unit  = println("B")

     }
    val t=new B("Suryabhan",25)
    t.a()
    t.b()

     */
    /*
    abstract class A(val name:String) {
      def a():Unit
      def b() : Unit=println(name)

    }
    class B(name:String) extends A(name){
      def a() : Unit = println("Suryabhan")
    }
     val t=new B("Surya")
     t.b()
       t.a()

      */

    /*
    enum Color {
      case Red , Green, Blue

    }
    def A()= {
      val c: Color = Color.Red
      println(c)
    }

     */

    /*
    enum Color {
      case  Red, Green, Blue
    }

     def testEnum() = {

       val c: Color = Color.Red
       println(c)
     }

      */


    /*
     enum Color:
    case Red, Green, Blue

     def testEnum(): Unit =

    val c: Color = Color.Red
    println(c)




      */
    /*
    case class A(name: String, age: Int)
      def AB(u: A) = u match {
        case A(name, age) => println(s"Name : $name and Age : $age")
      }

        val c=A("surya",2)
          println(c.age)
    val a=List(
      A("surya1",45),
      A("Surya2",49),
      A("Tinku",12)
    )
    val result=a.filter(_.age > 15)
    println(result)



     */

    /*
    case class A(name:String, age:Int )
      def AB(u:A)  = u match {
        case A(name,age)=> println(s"Name: $name and Age: $age")
      }
    val p=A("Surya",25)
    println(p)


     */

    /*
    case class A(name: String, age: Int)
    val p = A("Surya", 45)

    p match {
      case A(x, y) if (y > 18) => println(s"Name : $x and Age : $y")
    }

    val b = List(
      A("Surya1", 25) ,
        A("Surya2", 56),
        A("Surya3", 59)
    )
    val d = b.filter(_.age > 12)
    println(d)


     */

    // A simple scala program of enumeration

    /*
    object Main extends Enumeration {
      type Main = Value

      val first = Value("Thriller")
      val second = Value("Horror")
      val third = Value("Comedy")
      val fourth = Value("Romance")
    }
    println(s"Main Movie Genres = ${Main.values}")


    */
    /*
    class A {
      def apply(x:Int, y: Int): Int= x+y
    }
    object D extends A
    val b=new A()
    println(b(12,45))

     */

    /*
    case class A(x:Int, y: Int) {
     def apply(t: Int, r: Int): Unit = {
       val a = t + r
       println(a)
     }
   }
    val f=A(59,89)
    println(f)
    object B extends App {
      val d=A(45,20)
      println(d)

      //println(d.a())
    }

   // val p=A(25,45)

   // println(p)

     */
    /*
class A private () {
  def Ab(name:String):Unit=println(s"Name : $name")
}
    object A {
      private val a=new A()
      def getb():A=a
    }
    val p=A.getb()
    p.Ab("S")

 */
    /*
   class A private (){
      def ab(x:Int, y:Int): Unit = {
        println(x+y)
      }
   }
    object A {
      private val a=new A()
        def getb():A = a

    }
    val p=A.getb()
    p.ab(45,89)


    */


    /*
    abstract class A {
      def ab() : Unit
      def ac(name:String) : Unit =println(s"Name : $name")

    }
    class B extends A{
      def ab() : Unit=println("B")
    }
     val a=new B()
     a.ab()
    a.ac("Suryabhan Singh")

      */
    /*
    trait A {
      def a(name:String):Unit= println(s"$name")
    }
    class B(name:String) extends A(){
      def af() : Unit=println(s"$name")
      def ab(x:Int, y:Int): Unit={
        println(x+y)
      }
    }
    val f=new B("B")
    f.a("A")
    f.ab(12,45)
    f.af()


    */
    /*
    object A {
      def apply(name:String) : Unit=println(s"Name : $name")
    }
    val a=A("Surya")
    println(a.hashCode())

     */
    /*
    class A(name:String, age:Int) {
     //  def getname(): String = name
      // def getage() : Int=age
       def setage(ages: Int): Unit=println(ages)
     }
      val a=new A("S",48)
      a.setage(45)


     */
    /*
    class A private(val name: String,val age: Int){

    }
      object A {
        def apply(name: String, age: Int): A = new A(name, age)


    }

    val a =  A("Suryaq",56)
    println(a.name)
    A.apply("Surya",45)

 */
     /*
    class A(val name: String, val age: Int)
    object A {
      def apply(name: String, age: Int): A = new A(name, age)
    }
    val p = A("Surya", 15)
   println(p.name)
    val v= List(p.name, p.age)
    println(v)
   val g=v.reverse
    println(g)

      */
      /*
    class Person(val name:String, val age:Int) {
      def Ab(): Unit=println(s"Person => Name : $name and Age : $age ")
    }
    class Student( name:String,  age:Int )
      extends Person(name, age){
      def AB() : Unit=println(s"Student => Name : $name and Age : $age")

    }

    val t=new Person("Surya1", 45)
      t.Ab()
    val u=new Student("Surya2",48)
    u.AB()
    val a: Person = new Student("Surya",45)
    a.Ab()

       */

     case  class Student(
                   val name: String="Unknown",
                   val age: Int=45,
                   val city_name: String ="Delhi"
                   )
    def A() : Unit= {
      val p1 = new Student("Surya", 25, "Noida")
      println(p1)
      val p2 = new Student("Amit", 69)
      val p3 = new Student()
    }
    A()

  }
}