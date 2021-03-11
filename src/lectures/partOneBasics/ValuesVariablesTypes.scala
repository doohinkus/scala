package lectures.partOneBasics

object ValuesVariablesTypes extends App{
  // no need for semi colon at end of line
  // VALS ARE IMMUTABLE
  // types are optional, but use them for clarity
  // val x = 47, works
  val x: Int = 47
  println(x);

  val aBool:Boolean = false

  val aLong:Long = 12321321321L

  val aShort:Short = 1321

  val aFloat:Float = 12.354f

  val aDouble:Double = 12.3455


  val someString: String = "I am a string, man " + x
  println(someString)

  // variables can be reassigned
  // side effects

  var aVar:Int = 5
  aVar = 17
  println(aVar)
}
