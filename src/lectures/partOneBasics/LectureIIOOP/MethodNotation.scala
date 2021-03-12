package lectures.partOneBasics.LectureIIOOP

object MethodNotation extends App{
  class Person(val name:String, favoriteMovie:String){
    def likes(movie:String):Boolean = movie == favoriteMovie
    def hangsWith(person: Person):String = s"${this.name} hangs with ${person.name}"
    def ^(person: Person): String = s"${this.name} and ${person.name } wear ^ hats because special characters can be methods in Scala!!!"

  }
  val mary = new Person("Mary", "Shining")
  println(mary.likes("Shining"))
  println(mary likes "Star Wars") // same as above works with ONE arg

  val tom = new Person("Tom", "Fight Club")
  val jim = new Person("Jim", "Groundhog Day")

  println(mary.hangsWith(jim))
  println(mary hangsWith tom)

  println(mary.^(jim))
  println(mary ^ tom)

}
