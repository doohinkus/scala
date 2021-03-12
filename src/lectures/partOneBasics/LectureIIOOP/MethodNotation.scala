package lectures.partOneBasics.LectureIIOOP

object MethodNotation extends App{
  class Person(val name:String, favoriteMovie:String){
    def likes(movie:String):Boolean = movie == favoriteMovie
    def hangsWith(person: Person):String = s"${this.name} hangs with ${person.name}"
    def ^(person: Person): String = s"${this.name} and ${person.name } wear ^ hats because special characters can be methods in Scala!!!"
    def isAlive():String = s"Person is alive!"
    def apply(): String =s"Hey, my name is $name and I love $favoriteMovie."
  }
  val mary = new Person("Mary", "Shining")
  println(mary.likes("Shining"))
  println(mary likes "Star Wars") // same as above works with ONE arg

  val tom = new Person("Tom", "Fight Club")
  val jim = new Person("Jim", "Groundhog Day")

  println(mary.hangsWith(jim))
  println(mary hangsWith tom)

  // ALL operators are METHODS in Scala
  println(mary.^(jim))
  println(mary ^ tom)

  // prefix notation
  // unary operators ARE methods
  // only works with + - ~ !
  // must use space after : in def
  // def unary_! : String = s"$name is great!"
  val x = -1
  val y = 1.unary_-


  //postfix notation only works with NO PARAM method
  println(mary isAlive)
  println(mary.isAlive)


  // apply
  println(mary.apply)
  println(jim())

}
