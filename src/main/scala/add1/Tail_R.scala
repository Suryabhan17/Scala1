package add1

import scala.annotation.tailrec


object Tail_R {
  def main(args : Array[String]): Unit = {
    // import scala.annotation.tailrec
    /* def fa(n: Int): Int = {
      @tailrec
      def loop(x: Int, acc: Int): Int =
        if (x <= 1) acc else loop(x - 1, acc * x)
      loop(n, 1)
    }
    println(fa(5))
    */
    //@scala.annotation.tailrec
    /*def A[B](n: List[B], acc: List[B]=Nil): List[B]=
      if(n.isEmpty) acc else A(n.tail,  n.head::acc)
      println(A(List(1,2))) */
    //  println("NEW")

    /*def A(n:Int): Int={
      @tailrec
      def loop(a:Int , b: Int , count : Int ): Int=
        if(count==0) a else loop(b, a+b, count-1)
        loop(0,1,n)
      }
      println(A(8))
    */
    /*
    def A(n:Int , acc: Int = 0 ): Int =
    if (n==0) acc else A(n/10, acc+1)
    println(A(123456))
  */
    /* def Max2(n: List[Int]  , Max1: Int=Int.MinValue): Int=
    if (n.isEmpty) Max1
    else Max2(n.tail, if(n.head > Max1) n.head else Max1)
    println(Max2(List(1,2,5,8,23,35))) */

    /*  // Even Number
    def A(n: List[Int]): Unit = {
      if (n.isEmpty) ()
      else {
        if (n.head % 2 == 0) print(n.head + " ")
        A(n.tail)
      }


    }
    A(List(1, 2, 3, 4, 5))

   */
    /* // Even Number Add
    def A(n:List[Int],acc: Int=0): Int=
      if (n.isEmpty) acc
      else A(n.tail,acc + (if (n.head%2==0) n.head else 0 ))
    println(A(List(2,3,4,5,6,78,8))) */
    /*def A(x: Int, n: Int, acc: Int = 1): Int =
    if (n == 0) acc else A(x, n - 1, acc * x)

    println(A(2, 5)) */
    /*
    def A(n:List[Int], acc:Int=0 ): Int =
      if (n.isEmpty) acc else A(n.tail, acc + (if (n.head % 2 == 0) 1 else 0))
      println(A(List(1, 2, 3, 4, 5, 6, 7, 8, 9)))
  */
    /*
    def A(n:List[Int],acc: Int=Int.MaxValue): Int =
    if(n.isEmpty) acc else A(n.tail, if(n.head<acc) n.head else acc)
    println(A(List(1,2,3,4,5,67,8,9,10)))
  */
    /*
    def A(n:List[Int], acc: Int =1): Int =
    if (n.isEmpty) acc else A(n.tail , acc * n.head )

   println(A(List(1,2,4,2)))

    */
    /*
    def A(n:String , acc: String="" ): String=
    if (n.isEmpty) acc else A(n.tail, n.head + acc)
    println(A("Hello"))
  */


    /*
    // Count String Number
    def A(n:String, acc : Int=0) : Int=
    if (n.isEmpty) acc else A(n.tail,  acc + 1 )
      println(A("Helloa")) */


    /* // Count Space Remove
    def A(n:String, acc: String=""): String =
    if(n.isEmpty) acc else A(n.tail, if(n.head==' ') acc else acc + n.head)
    println(A("H e l l o"))

    */
    /* def A( x:Int , a: Int=1, b: Int=1): Int=
       if (x == 0) a else A(b, a+b , x-1)
      // A(x, 1)

       println(A(7))

     */


    /* @scala.annotation.tailrec
 def sumList(lst: List[Int], acc: Int = 0): Int =
 if (lst.isEmpty) acc else sumList(lst.tail, acc + lst.head)

  println(sumList(List(1, 2, 3, 4, 5))) */


    /* @scala.annotation.tailrec
    def reverseList[A](lst: List[A], acc: List[A] = Nil): List[A] =
      if (lst.isEmpty) acc else reverseList(lst.tail, lst.head :: acc)

    println(reverseList(List(1, 2, 3, 4)))

    */
    /*
 // Factorial
     def A(n:Int , acc: Int=1): Int =
       if(n<=1) acc else A(n-1, acc * n)

       println(A(5))


     */
    /*
     def A(n:List[Int], acc : Int=0): Int=
    if(n.isEmpty) acc else A(n.tail, acc +n.head)
     println(A(List(1,2,3,4,5)))

     */
    /*
    def A(n: List[Int], acc: List[Int] =Nil ): List[Int] =
      if(n.isEmpty) acc  else A(n.tail ,    n.head :: acc)
    println(A(List(1,2,3,4,5)))

     */
    /*
    def A(n: List[Int], acc:List[Int]=Nil): List[Int]=
      if (n.isEmpty) acc.reverse else A(n.tail, if(n.head % 2==0) n.head :: acc else acc)
      println(A(List(1,2,3,4,5,6)))

     */

    /*
    def A(n:List[Int] , acc: Int = 0): Int=
    if(n.isEmpty) acc else A(n.tail, acc + n.head)
    println(A(List(1,2,3,4)))

     */
     /*
    def A(n:List[Int], acc: Int=0): Int=
      if (n.isEmpty) acc else A(n.tail, acc + (if (n.head%2==0) 1 else 0 ) )
      println(A(List(1,2,3,4,5,8)))

      */
    /*
    def A(n:List[Int], acc:List[Int]=Nil):List[Int]=
     if (n.isEmpty) acc  else A(n.tail, n.head :: acc)
     println(A(List(1,2,3,4,5)))

     */
    /*
      def A(n:List[Int], acc:Int=0): Int =
     if (n.isEmpty) acc else A(n.tail, if(n.head>acc)n.head else acc)
     println(A(List(21,34,56,78,54,85,23)))


     */

  /*
    def countOccurrences(list: List[Int], element: Int): Int = {
      @tailrec
      def loop(lst: List[Int], acc: Int=0): Int = {
        if (lst.isEmpty) acc
        else loop(lst.tail , (if (lst.head == element) acc + 1 else acc ))

      }

      loop(list)
    }


    println(countOccurrences(List(1, 2, 2, 3, 2), 2)) // 3
    println(countOccurrences(List(10, 20, 30, 20), 20)) // 2
    println(countOccurrences(List(5, 5, 5, 5), 5)) // 4
    println(countOccurrences(List(1, 2, 3), 10)) // 0

   */

    /*
   def A(n:List[Int], e: Int): Boolean={
     @tailrec
     def loop(x:List[Int] ): Boolean={
       if (x.isEmpty)  false else if(x.head == e) true  else  loop(x.tail)

     }
     loop(n)
   }
    println(A(List(10,20,30), 2))

     */
     /*
    def A(n:List[List[Int]] ): List[Int]={
      @tailrec
      def loop(x:List[List[Int]], acc:List[Int]=Nil) : List[Int]={
        if(x.isEmpty) acc.reverse else loop(x.tail, x.head.reverse ::: acc)
      }
      loop(n)
    }

    println(A(List(List(1, 2), List(3, 4)))) // List(1, 2, 3, 4)
    println(A(List(List(10), List(), List(20, 30)))) // List(10, 20, 30)
    println(A(Nil))

      */
      /*
    def A(n:List[Int]):List[Int]={
      @tailrec
      def loop(x:List[Int],seen: Set[Int], acc: List[Int]=Nil):List[Int]={
        if(x.isEmpty) acc.reverse else if(seen.contains(x.head)) loop( x.tail ,seen, acc)else loop(x.tail, seen + x.head ,  x.head :: acc)
      }
      loop(n,Set())
    }
    println(A(List(1,2,2,3,1)))

       */
  /*
    def A(n:Map[String, Int]): Int={
      @tailrec
      def loop(v:List[Int], acc:Int=0): Int={
        if(v.isEmpty) acc else loop(v.tail, acc + v.head)
      }
      loop(n.values.toList)
    }

    println(A(Map("a" -> 10, "b" -> 20, "c" -> 30))) // 60
    println(A(Map("x" -> 5, "y" -> 15))) // 20
    println(A(Map()))

   */
  /*
    def A(n:List[List[Int]]):List[Int]={
      @tailrec
      def loop(x:List[List[Int]], acc:List[Int]=Nil):List[Int]={
        if(x.isEmpty) acc.reverse else loop(x.tail, x.head.reverse ::: acc)
      }
      loop(n)
    }
    println(A(List(List(1,2,3),List(4,5,6))))

   */
   /*
    def A(n:List[Int]):Int={
      @tailrec
      def loop(x:List[Int], acc: Int=1): Int={
        if (x.isEmpty) acc else loop(x.tail, x.head * acc)
      }
      loop(n)
    }
    println(A(List(2,4,3)))

    */
    /*
    def A(n:List[Int]):Int={
      @tailrec
      def loop(x:List[Int], acc: Int=0,a:Int=Int.MinValue): Int={
        if(x.isEmpty) acc else loop(x.tail, acc +(if (x.head==a) 0 else 1) )
      }
      loop(n)
    }
    println(A(List(1,2,0,3,4,8,-2)))

     */


    /*
    def A(n:List[Int]): List[Int]={
      @tailrec
      def loop(x:List[Int], acc: List[Int]=Nil):List[Int]={
        if(x.isEmpty) acc.reverse else loop(x.tail, if(x.head%2==0)x.head :: acc else acc )
      }
      loop(n)
    }
    println(A(List(1,2,3,4,5,6,7,8,9,10)))


     */
    /*
    def A(n:List[List[Int]]):List[Int]={
      @tailrec
      def loop(x:List[List[Int]],acc:List[Int]=Nil): List[Int]={
        if(x.isEmpty) acc.reverse else loop(x.tail, x.head.reverse ::: acc)
      }
      loop(n)
    }
    println(A(List(List(1,2,3,4),List(6,5,6,7))))


     */



    /*



    def A(n:List[Int]): Int={
      @tailrec
      def loop(x:List[Int], acc: Int=0):Int={
        if(x.isEmpty) acc else loop(x.tail, acc +(if(x.head%2==0) 1 else 0))
      }
      loop(n)
    }
    println(A(List(1,2,3,4,5,6,7,8,9,10)))


     */

/*
    def A(n:List[Int]): List[Int]={
      @tailrec
      def loop(x:List[Int], acc:List[Int]=Nil): List[Int]={
        if(x.isEmpty) acc else loop(x.tail, x.head :: acc)
      }
      loop(n)
    }
    println(A(List(1,2,3,4,5)))

 */












  }








}
