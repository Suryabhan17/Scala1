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
  }

}
