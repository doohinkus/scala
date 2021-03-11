package lectures.partOneBasics

object Functions extends App{
  def aFunct(a: String, b: Int):String = {
    a + " " + b
  }
  println(aFunct("yeppity", 89))
// USE RECURSION FOR LOOPS
  def aRepeatedFunc(a: String, n:Int):String = {
    var result:String =  a + " " + n + "\n"
    if(n == 1) result
    else result + aRepeatedFunc(a, n - 1)
  }
  println(aRepeatedFunc("a >", 4))

  // HOW TO HANDLE SIDE EFFECTS
  // Use unit as return type
  def aFuncWithSideEffects(aStr: String): Unit = println(aStr)
  aFuncWithSideEffects("test")


  def greet(student:String, age:Int): Unit = {
    println("Hello " + student + " who is " + age + " years old.")
  }
  greet("johnny", 53)

  def factorial(n:Int):Int = {
    if(n == 1) n
    else n * factorial(n - 1)
  }
  println(factorial(5))

  def fibinacci(n:Int):Int = {


    def add(x: Int): Int = {
      if (x < 1) x
      else x + fibinacci(n - 1)
    }
    if (n == 1) n
    else add(fibinacci(n - 1))

  }
  println(fibinacci(3))

  def isPrime(n:Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if(t <= 1) true
      else  n % t !=0 && isPrimeUntil(t - 1)
    isPrimeUntil(n / 2)
  }
  println(isPrime(9), " isPrime ", isPrime(7))
}




