

//val str = "abcd"
//val i = 3
//str.take(i)
//str.takeRight(str.length - i - 1)
//(str.take(i) + str.takeRight(str.length - i - 1)).length
//str(i) + str.take(i) + str.takeRight(str.length - i - 1)
//



//def permutations(s: String): Seq[String] = {
//  if (s.length == 0) Seq("")
//  else for {
//    i <- 0 until s.length
//    q <- permutations(s.take(i) + s.takeRight(s.length - i - 1))
//  } yield s(i) + q
//}
//
//println(permutations("abcd"))


//def compose[A,B,C](f: A => B, g: B => C): A => C = {
////    a => g(f(a))
//    g compose f
//}
//
//
//val ret = compose[Int,Int,Int](x => x+1, y => y+2)
//ret(1)


//def fuse[A, B](a: Option[A], b: Option[B]): Option[(A, B)] =
//  for {
//    x <- a
//    y <- b
//  } yield(x,y)
//
//
//val ret1 = fuse[Int,Int](None, Some(2))

//def product(xs: List[Int]): Int = (1 /: xs)(_ * _)
//product(List(1,2,3,4,5))
//
//
//def check[T](xs: Seq[T])(pred: T => Boolean): Boolean =
////  xs.map(pred(_)).fold(true)( _ && _)
//  xs.forall{ x =>
//    try {
//      pred(x)
//    } catch {
//      case _ : Exception => false
//    }
//  }
//
//
//check(0 until 10)(40 / _ > 0)

//class Pair[P, Q](val first: P, val second: Q) {
//  def hit(x: (P,Q)): Boolean =
//    x.equals((first, second))
//}
//
//val pair = new Pair[String, Int]("Dennis", 49)
//
//
//val ret = pair.hit("Dennis", 48) match {
//  case true => "treffer"
//  case _ => "nichts"
//}

