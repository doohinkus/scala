package lectures.partOneBasics

object Expressions extends App{
   // compiler infers types
  // operators only work with variables
   val x = 1 + 2
   println(x)

  // instructions are (DO) vs expressions (VALUE or TYPE)
  val y = 1 >> 2
  println(y, " ", 1.toBinaryString, " ", 2.toBinaryString, y.toBinaryString)

  // code returns a VALUE, not DO
  // if EXPRESSOIN it returns a value
  val result = if(true) 10 else 3

  println(result)

  // AVOID LOOPS!!!!!!!!!

  // everyting in Scala is an expression

  // Unit is like void
  // while, reassign print are UNIT, SIDE EFFECTS

  // code blocks
  // value of block is the value of its last expression

  val blockIt = {
    var alice = 3
    var bob = 9
    alice + bob
  }
  println(blockIt)



}
