package Traits_and_Enums

object Traits1 {
  def main(args :Array[String] ) : Unit ={

    /*
    class A {
      println("A constructor")
    }
    trait T {
      println("T constructor")
    }
    trait T1 {
      println("T1 constructor")
    }
    class B extends A with T with T1 {
      println("B constructor")
    }
    val p= new B()

     */
    /*
    trait Animal {
      def sound() : Unit
    }
     class Dog extends Animal {
       override def sound() : Unit = println("Dog barks")
     }
     class Cat extends Animal {
       override def  sound() : Unit=println("Cat meows")
     }
    val p=new Cat()
      p.sound()
    val t=new Dog()
    t.sound()

     */


    /*
    trait A {
      val a: String
      val b:Int
    }
    class B extends A {
      val a= "Surya"
      val b=45
    }
       val p= new B()
       println(p.a + " and " + p.b)

     */
      /*
    trait A {
      def sound() : Unit
      val a: String
    }
    class B extends A {
      def sound() : Unit=println("Suryabhan")
      val a="Singh"
    }
    val p=new B()
      p.sound()
    println(p.a)

       */
    /*
    trait Auth {
      def authenticate(): Unit = println("Authenticating...")
    }

    trait Logger {
      def log(msg: String): Unit = println(s"[LOG] $msg")
    }

    class ApiService

    class UserApi extends ApiService
      with Auth
      with Logger
     val p=new UserApi()
       p.authenticate()

     */

    /*
   trait A {
      def a() : Unit=println("A")
    }
    trait B extends A {
      override def a() : Unit={
        println("B")
        super.a()
      }
    }
    trait C extends A {
      override def a() : Unit= {

        println("C")
        super.a()
      }
    }
    class X extends A with B with C {
      override def a() : Unit= {
        println("X")
        super.a()
      }
    }
    val p=new X()
       p.a()

     */
    /*
    trait A {
      def a() : Unit = {
        println("A")

      }
    }
    class B extends A {
      override def a() : Unit = {
        println("B")
        super.a()
      }
    }
    val p= new B()
      p.a()

     */

    /*
      class A {
      def a() : Unit=println("A")
    }
    class B extends A {
      override def a() : Unit= println("B")
    }

    val p=new B()
     val c : A = p
      c.a() // upcasting
       // and
   // val c  = p.asInstanceOf[B]
   // c.a()  // down_casting

     */

    /*
      val p=classOf[String]
    println(p)

     */
    /*
    def A(c: Class[_]) : Unit={
      println("Class name = " + c.getName)
    }
    A(classOf[Int])

     */

     /*
    def A[T](c:Class[T]) : T={
      c.newInstance()
    }
    class Person {
      override def toString=" Person Created"
    }
    val p=A(classOf[Person])
    println(p)

      */
     /*
     class A {
       private def a() : Unit = println("Hello")
       def B() : Unit= a()
     }
    val p=new A()

    p.B()

      */
    /*
    class A {
        private var a= 45
       def a(b: A) : Unit = println(b.a)
     }
    val p= new A()

     */
    /*
    class A {
       private var a:Int = 45
       def ab() : Unit = {
         println(a)
       }
         def ac() : Unit = {
           a = a+ 1
         }

     }
    val p=new A()
      p.ab()
     p.ac()
      p.ab()


     */
      /*
    class A {
      println("A constructor")
    }
    trait  t {
      println(" T constructor")
    }
      trait t1 {
        println(" t1 constructor ")
      }
    class B extends A with t with t1 {
      println(" B constructor")
    }
    val p=new B()

       */
     /*
    trait A {
      def a(): Unit=println("Surya")
    }
      trait B {
        def a() : Unit =println("Surya1")
      }
     class C extends A with B {
       override def a() : Unit=println("Surya2")
       super.a()
     }
      val p=new C()  
      
      */
    /*
    case class A(name : String , age : Int) 
    val p=A("surya", 25)
      p match {
        case A( a ,b ) => println(b)
      }
     val d=List(A("Surya" , 2),
       A("Suryabhan" , 8)
     )
    println(d)  
    
     */
    /*
    class A(val name:String , val age: Int) {
       def a():Unit =println("A")
     }
    class B( name:String , age:Int) extends A(name , age) {
      override  def a(): Unit = println("B")
    }
    val t=new A("S" , 56)
    println(t.name + " and " + t.age)
    val p=new B("Surya1",25)
    println(p.age)   
     
     */
    
    trait A {
      println("A")
    }
    trait B extends A {
      println("B")
    }
    trait C extends B {
      println("C")
    }
    class D extends C {
      println("D")
    }
    val p=new D()


  }

}
