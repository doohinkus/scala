package lectures.partOneBasics

import scala.annotation.tailrec
// USE TAIL RECURSION
object Recursion extends App{
  @tailrec
  def factorial(n:Int, acc:Int):Int = {
    if(n <= 2) acc
    else factorial(n - 1, n *  acc)
  }



  def optimisedFactorial(n:Int): BigInt = {
    @tailrec
    def factorialHelper(x: BigInt, accumulator: BigInt): BigInt =
      if(x < 1) accumulator
      else factorialHelper(x - 1, x * accumulator) // TAIL RECURSION
    factorialHelper(n,1)
  }
  println("asfs>>>fds",optimisedFactorial(5000))
//  optimisedFactorial(10) = factorialHelper(10,1)
//  = factorialHelper(9, 10 * 1)
  //  = factorialHelper(8, 9 * 10 * 1)
  //  = factorialHelper(7, 8 * 9 * 10 * 1)
//    ...
  //  = factorialHelper(2, 3 * 4 * ... 10 * 1)
  //  = factorialHelper(1, 1 * 2 * 3 * 4 * ... 10 * 1)
  // returns accumulator -> 1 * 2 * 3 * 4 * ... 10


  // USE TAIL RECURSION FOR LOOPS
  @tailrec
  def repeatTail(a: String, n:Int, acc:String):String = {
    var result = acc + a
    if(n <= 0) acc
    else repeatTail(a, n - 1, result)
  }
  println(repeatTail("r", 4, ""))


  def isPrime(n:Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int): Boolean =
      if(t <= 1) true
      else  n % t !=0 && isPrimeUntil(t - 1)
    isPrimeUntil(n / 2)
  }
  println(isPrime(9), " isPrime ", isPrime(7))

}
